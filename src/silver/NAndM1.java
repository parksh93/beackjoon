package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NAndM1 {
	static int n, m;
	static int [] ar;
	static boolean [] check;
	static StringBuffer sb = new StringBuffer();
	public static void dfs(int a) {
		
		//a가 m과 같아졌을때 stringbuffer에 ar배열의 값을 담고 해당 재귀호출을 종료
		if (a == m) {
			for (int i : ar) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		// 0부터 n까지 반복
		for (int i = 0; i < n; i++) {
			//check 배열의 i번째 값이 false일 경우 (방문하지 않았을 경우)
			if (!check[i]) {
				//check 배열의 i번째 값을 true로 변경 (방문했음을 표시)
				check[i] = true;
				//ar 배열의 a번째 값에 i+1대입 
				ar[a] = i + 1;
				//다음 노드로 이동해야하기 때문에 +1해준다
				dfs(a + 1);
				
				//dfs함수가 if(a == m)을 통해 종료됐을때 마지막으로 방문한 노드를 다시 false로 변경
				check[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		ar = new int [m]; //한줄에 2개의 값이 출력돼야 되기 때문에 m의 길이를 준다
			check = new boolean [n]; //1부터 n까지 값의 방문 여부를 판단해야되기 때문에 n의 길이를 준다
		
		dfs(0);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}