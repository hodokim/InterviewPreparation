package codingTest;

public class BubbleSort_226_해커랭크 {
	static void countSwaps(int[] a) {
		int n = a.length;
		int cnt = 0;
		int temp = 0;
		boolean lucky = true;
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					cnt++;
					lucky = false;
				}
			}
			if(lucky) {
			  break;
			}

		}
		System.out.printf("Array is sorted in %d swaps.\n", cnt);
		System.out.printf("First Element: %d\n", a[0]);
		System.out.printf("Last Element: %d\n", a[n - 1]);

	}
}
