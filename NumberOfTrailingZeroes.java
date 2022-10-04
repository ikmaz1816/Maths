package math;

import java.util.Scanner;

public class NumberOfTrailingZeroes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		for(int i=5;n/i>=1;i*=5)
		{
			res=res+n/i;
		}
		System.out.println(res);
		sc.close();
	}

}
