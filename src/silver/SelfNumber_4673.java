package silver;

import java.util.ArrayList;
import java.util.List;

public class SelfNumber_4673 {
	public static void main(String[] args){
		List<Integer> dList = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 1; i <= 10000; i++) {
			String s = String.valueOf(i);
			int n = 0;
			for (int j = 0; j < s.length(); j++) {
				n += Character.getNumericValue(s.charAt(j));
			}
			n += i;
			dList.add(n);
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (!dList.contains(i)) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
}
