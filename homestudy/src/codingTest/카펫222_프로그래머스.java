package codingTest;

public class 카펫222_프로그래머스 {
	public static int[] solution(int brown, int red) {

		int height = 0;
		int width = 0;
		for (height = 3; height <= (int) (brown + 4) / 2; height++) {

			width = ((brown + 4) / 2) - height;
			if (width < height) {
				break;
			}

			int redCount = (width - 2) * (height - 2);
			if (red == redCount) {
				break;
			}
		}

		int[] answer = new int[] { width, height };
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(4,4));
	}

}
