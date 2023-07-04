package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordSort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> inWord = new HashSet<>();
		List<String> sortWord = new LinkedList<>(); 
		
		int numCnt = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numCnt; i++) {
			inWord.add(br.readLine());
		}
		
		Iterator<String> iter = inWord.iterator();
		
		while (iter.hasNext()) {
			if (sortWord.size() == 0) {
				sortWord.add(iter.next());
			}
			
		}
		
		
	}
}
