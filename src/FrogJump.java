
public class FrogJump {

	public int solution(int X, int Y, int D) {
		int remaining = Y - X;
		int jumps = remaining / D;
		if (remaining % D > 0)
			jumps++;
		return jumps;
	}

}
