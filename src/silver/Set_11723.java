package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Set_11723 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		
		List<Integer> set = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String calculation = st.nextToken();
			int num = 0;
			if(!calculation.equals("all") && !calculation.equals("empty")) {
				num = Integer.parseInt(st.nextToken());
				
			}
			switch (calculation) {
			case "add":
				if (!set.contains(num)) {
					set.add(num);
				}
				break;
			
			case "remove" :
				if(set.contains(num)) {
					set.remove(set.indexOf(num));
				}
				break;
				
			case "check" : 
				if(set.contains(num)) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
				
			case "toggle" :
				if(set.contains(num)) {
					set.remove(set.indexOf(num));
				}else {
					set.add(num);
				}
				break;
				
			case "all" :
				set.clear();
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
				break;
			
			case "empty" :
				set.clear();
				break;
				
			default: break;
			}
		}
		
		System.out.println(sb);
	}
}
