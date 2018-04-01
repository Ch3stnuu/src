import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		
		for (int i = 0; i < a.length; i++) {
			Arrays.fill(a[i], Integer.MAX_VALUE);
			for (int j = 0; j < a[i].length; j++)
				System.out.println(a[i][j]);
		}
	}
}
