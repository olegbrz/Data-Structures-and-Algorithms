public class PeakSearch {

	/* Brute Force approach */
	public static int peakBT(int[] A) {

		int peak = A[0];
		int previous = A[0];
		boolean found = false;

		int i = 0;
		while (!found) {
			if (A[i] < previous) {
				found = true;
				peak = previous;
			}
			previous = A[i];
			i++;
		}
		return peak;
	}

	/* Recursive approach */
	public static int peakR(int[] A, int start, int end) {
		/* Get array length and the middle element */
		int n = A.length;
		int midE = start + (end - start) / 2;

		/* End of recursion statement */
		if ((midE == 0 || A[midE - 1] <= A[midE]) && (midE == n - 1 || A[midE + 1] <= A[midE]))
			return A[midE];

		/* If the mid-1 element is less than mid, then search in the right part */
		else if (midE > 0 && A[midE - 1] < A[midE])
			return peakR(A, midE + 1, end);

		/* Otherwise, search in the left part */
		else
			return peakR(A, start, midE - 1);
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 7, 9, 6, 2 };
		int n = A.length;

		System.out.println(peakBT(A));
		System.out.println(peakR(A, 0, n - 1));

	}

}
