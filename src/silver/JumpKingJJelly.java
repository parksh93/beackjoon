package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JumpKingJJelly {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<>();

		int size = Integer.parseInt(br.readLine());
		int ar[][] = new int[size][size];
		boolean visited[][] = new boolean[size][size];
		boolean check = false;

		for (int i = 0; i < ar.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		que.add(0);

		if (ar[0][0] < size && ar[0][0] != 0) {
			outer: while (!que.isEmpty()) {
				int i = que.poll();
				if (i == 0) {
					if (ar[0][i] >= size && ar[i][0] >= size) {
						break outer;
					}
				}

				for (int j = 0; j < ar[i].length; j++) {
					if (!visited[i][j]) {
						visited[i][j] = true;
						// 아래쪽 검사
						if (i + ar[i][j] < size) {
							if (ar[i + ar[i][j]][j] == -1) {
								check = true;
								break outer;
							}
							if (ar[i + ar[i][j]][j] < size && ar[i + ar[i][j]][j] != 0) {
								que.add(ar[i + ar[i][j]][j]);
							} else {
								visited[i + ar[i][j]][j] = true;
							}
							continue;
						}

						// 오른쪽 검사
						if (j + ar[i][j] < size) {
							if (ar[i][j + ar[i][j]] == -1) {
								check = true;
								break outer;
							}
							if (ar[i][j + ar[i][j]] < size && ar[i][j + ar[i][j]] != 0) {
								que.add(ar[i][j + ar[i][j]]);
							} else {
								visited[i][j + ar[i][j]] = true;
							}
							continue;
						}

					}
					if (i + 1 < size) {
						i++;
					}
				}
			}
		}

		if (check) {
			System.out.println("HaruHaru");
		} else {
			System.out.println("Hing");
		}
	}
}