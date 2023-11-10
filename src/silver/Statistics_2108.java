package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics_2108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		Arrays.sort(arr);
		
		int count = 0;
		int max = -1;
		int mod = arr[0];
		/*
		 		boolean 값을 설정하는 이유?
		 		해당 문제는 같은 최빈값을 가진 값이 있으면 그 중 두번째로 작은 값을 출력하는 문제이기 때문에
		 		처음 최빈값으로 등록된 값과 같은 갯수의 최빈값이 있을 때 미리 정렬을 해놨기 때문에 후에 들어온 값은
		 		자동으로 두번째로 작은 값이 된다. 그 후 check가 false로 바뀌기 때문에 이 후에 또 같은 갯수의 최빈값이 있다고 해도
		 		check가 true가 되지 않기 때문에 최빈값은 항상 두번째로 작은 값으로 유지된다.
		 		(이전 최빈값의 갯수보다 큰 최빈값이 있다면 변경된다.) 
		 */
		boolean check = false;
		for(int i = 0; i < N - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				count++;
			}else {
				count = 0;
			}
			
			if(max < count) {
				max = count;
				mod = arr[i];
				check = true;
			}else if(max == count && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		
		System.out.println(Math.round(sum / N));
		System.out.println(arr[(N - 1) / 2]);
		System.out.println(mod);
		System.out.println(arr[N - 1] - arr[0]);
	}
}
