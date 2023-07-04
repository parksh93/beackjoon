package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnowWhiteAndSevenDwarf_3040 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] dwarf = new int [9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			dwarf[i] = a;
			sum += a;
		}
		StringBuffer sb = new StringBuffer();
		outer: for (int i = 0; i < dwarf.length-1; i++) {
			 for (int j = i+1; j < dwarf.length; j++) {
				if (dwarf[i] + dwarf[j] == sum - 100) {
					for (int k = 0; k < dwarf.length; k++) {
						if (dwarf[k] != dwarf[i] && dwarf[k] != dwarf[j]) {
							sb.append(dwarf[k]).append("\n");
						}
					}
					break outer;
				}
			}
		}
		System.out.println(sb);
	}
}
