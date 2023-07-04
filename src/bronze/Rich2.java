package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger money = new BigInteger(sc.next());
		BigInteger man = new BigInteger(sc.next());
		
		
		BigInteger mod = money.divide(man);
		
		BigInteger n = money.subtract(mod.multiply(man));
		
		System.out.println(mod);
		
		System.out.println(n);
	}
}
