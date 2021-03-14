import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		RotateArray f = new RotateArray();
		int [] g = {3, 8, 9, 7, 6};
		int[] ans = f.solution(g, 3);
		for(int o : ans) {
			System.out.println("anwser = " + o);
		}
		
	}
}
