package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpKingJJelly2 {
	static int ar [][];
	static int size;
	static boolean jump(int [] p) {
		int x = p[0];
		int y = p[1];
		
		if (x >= size || y >= size) {
			return false;
		}
		
		if (ar[x][y] == -1) {
			return true;
		}
		
		if (ar[x][y] == 0) {
			return false;
		}
		
		int down[] = {x, y + ar[x][y]};
		int right[] = {x + ar[x][y], y};
		
		return jump(down) || jump(right);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		size = Integer.parseInt(br.readLine());
		ar = new int[size][size];

		for (int i = 0; i < ar.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int [] a = {0,0};
		
		if (jump(a)) {
			System.out.println("HaruHaru");
		} else {
			System.out.println("Hing");
		}
	}
}