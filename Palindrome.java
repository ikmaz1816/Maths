package math;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(palindrome(n));
		sc.close();
	}

	private static boolean palindrome(int n) {
		return reverse(n)==n;
	}

	private static int reverse(int n) {
		int sum=0;
		while(n>0)
		{
			sum=10*sum+n%10;
			n/=10;
		}
		return sum;
	}

}
