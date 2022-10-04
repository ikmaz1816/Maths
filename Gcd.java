package math;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
		sc.close();
	}

	private static int gcd(int a, int b) {
		return b==0 ? a : gcd(b,a%b);
	}

}
