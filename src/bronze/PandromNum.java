package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PandromNum {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		
		while (true) {
			String num = br.readLine();
			if (num.equals("0")) {
				break;
			}
			
			list.add(num);
		}
		
		for (int i = 0; i < list.size(); i++) {
			int endIdx = list.get(i).length()-1;
			for (int j = 0; j < list.get(i).length(); j++) {
				if (list.get(i).charAt(j) != list.get(i).charAt(endIdx)) {
					System.out.println("no");
					break;
				}
				if (j >= endIdx) {
					System.out.println("yes");
					break;
				}
				endIdx--;
			}
		}
	}
}
