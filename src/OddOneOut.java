import java.util.Arrays;

public class OddOneOut {

	public int solution(int[] A) {
		Arrays.sort(A);
		int missing = -1;
		for(int i = 0; i < A.length; i += 2) {
			if(A.length == 1) {
				missing = A[0];
				break;
			}else if (A[i] != A[i+1]) {
				missing = A[i];
				break;
			}
		}
		return missing;
	}

}
