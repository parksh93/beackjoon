package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SevenDwarf {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> dwarfHeight = new ArrayList<>();
		
		for(int i = 0; i < 9; i ++){
			StringTokenizer st = new StringTokenizer(bf.readLine());
			dwarfHeight.add(Integer.parseInt(st.nextToken()));
		}
		
		
	}
}
