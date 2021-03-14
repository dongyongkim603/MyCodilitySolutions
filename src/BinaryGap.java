
public class BinaryGap {
	
	/**
	 * 
	 * @param N
	 * @return
	 */
	public int solution(int N) {
		int firstI = 0;

		for (int i = 0; i < 32; i++) {
			if (getNBit(N, i) == 1) {
				firstI = i;
				break;
			}
		}

		int biggest = 0;
		int current = 0;
		
		for (int i = firstI; i < 32; i++) {
			if (getNBit(N, i) == 0) {
				current++;
			} else {
				if (current > biggest) {
					biggest = current;
				}
				current = 0;
			}
		}
		return biggest;
	}

	/**
	 * 
	 * @param n
	 * @param p
	 * @return
	 */
	private int getNBit(int n, int p) {
		int mask = 1;
		final int ns = n >> p;
		return ns & mask;
	}
}
