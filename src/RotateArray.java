
public class RotateArray {

	public int[] solution(int[] A, int K) {
		int[] copyArr = new int[A.length];
		if (K != A.length || K != 0) {
			for (int i = 0; i < A.length; i++) {
				System.out.println("length = " + (A.length-1) + "\nj =  " + ((i + K) % (A.length)));

				int j = ((i + K) % (A.length));
				copyArr[j] = A[i];

			}
		} else {
			return A;
		}
		return copyArr;
	}

}