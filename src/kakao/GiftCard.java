package kakao;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;

		int [][] send = new int [friends.length][friends.length];
		int [][] get = new int [friends.length][friends.length];
		int [] result = new int [friends.length];
		
		List<String> friendList = Arrays.asList(friends);
		
		for (int i = 0; i < gifts.length; i++) {
			StringTokenizer st = new StringTokenizer(gifts[i]);
			String sender = st.nextToken();
			String getter = st.nextToken();
			
			send[friendList.indexOf(sender)][friendList.indexOf(getter)] += 1;
			get[friendList.indexOf(getter)][friendList.indexOf(sender)] += 1;
		}

		for (int i = 0; i < friends.length; i++) {
			for (int j = 0; j < send[i].length; j++) {
				if(send[i][j] > send[j][friendList.indexOf(friends[i])]) {
					result[i] ++;
				}else if(send[i][j] == send[j][friendList.indexOf(friends[i])]) {
					int myGiftCnt = 0;
					int friendGiftCnt = 0;
					for (int k = 0; k < send[i].length; k++) {
						myGiftCnt += send[i][k];
						myGiftCnt -= get[i][k];
						friendGiftCnt += send[j][k];
						friendGiftCnt -= get[j][k];
					}
					
					if(myGiftCnt > friendGiftCnt) {
						result[i]++;
					}
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			answer = Math.max(answer, result[i]);
		}
		
		return answer;
	}
	
}

public class GiftCard {
	public static void main(String[] args) {
		String[] friends = {"j", "b", "a","c", "d"};
		String[] gifts = {"a b", "a j", "a c", "d a", "a d"};
		int result = new Solution().solution(friends, gifts);
		
		System.out.println(result);
	}
}
