package codingTest;

import java.security.MessageDigest;

class Block{
    private String prevHash;
    private String data;
    private int nonce;
    private String hash;

    public Block(String prevHash, String data) {
        super();
        this.prevHash = prevHash;
        this.data = data;
    }

    public void genesisHash() {
        hash = encrypt(prevHash + data + nonce);
    }

    public void hash() {
        String tmp = "";
        while (true) {
            tmp = encrypt(prevHash + data + nonce);
            if(tmp.substring(0, 5).equals("00000")) {
                hash = tmp;
                break;
            }else {
                nonce++;
            }
        }
    }

    @Override
    public String toString() {
        return "Block [prevHash=" + prevHash + ", data=" + data + ", nonce=" + nonce + ", hash=" + hash + "]";
    }

    public void print() {
        System.out.println("nonce: " + nonce);
        System.out.println("data: " + data);
        System.out.println("prevHash: " + prevHash);
        System.out.println("hash: " + hash);
    }
    
    private static Block genesisBlock(String data) {
        Block block = new Block("", data);
        block.genesisHash();
        block.print();

        return block;
    }

    private static Block addBlock(String prevHash, String data) {
        Block block = new Block(prevHash, data);
        block.hash();
        block.print();

        return block;
    }
    
    public static String encrypt(String pwd) {
        StringBuffer hexString = new StringBuffer();

        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pwd.getBytes("UTF-8"));

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);

                if (hex.length() == 1) {
                    hexString.append('0');
                }

                hexString.append(hex);
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return hexString.toString();
    }
    
    
    public static void main(String[] args) {
        Block genesis = genesisBlock("Genesis Block");
        Block two = addBlock(genesis.hash, "two");
        Block three = addBlock(two.hash, "three");
    }
}