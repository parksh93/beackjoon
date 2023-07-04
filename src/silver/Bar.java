package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> totalBar = new ArrayList<>();
		
		int wantBarHeight = Integer.parseInt(br.readLine());
		int bar = 64;
		int cut = 0;
		
		totalBar.add(bar);
		
		while(true) {
			if (wantBarHeight < bar) {
				bar /= 2;
				totalBar.set(0, bar);					
			}else if(wantBarHeight > bar) {
				if (totalBar.size() == 1) {
					cut = totalBar.get(totalBar.size()-1) / 2 ;
					totalBar.add(cut);					
				}
				int sum = 0;
				for (int i = 0; i < totalBar.size(); i++) {
					sum += totalBar.get(i);
				}
				if (sum > wantBarHeight) {
					cut = totalBar.get(totalBar.size()-1) / 2;
					totalBar.set(totalBar.size()-1, cut);
				}else if(sum < wantBarHeight) {
					cut = totalBar.get(totalBar.size()-1) / 2;
					totalBar.add(cut);					
				}else {break;}
			}else {break;}
		}
		
		System.out.println(totalBar.size());
	}
}
