package math;

import java.util.Scanner;

public class ModularArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long res=1;
		int mod=1000000007;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=(res%mod*a%mod)%mod;
			}
			a=a*a;
			b>>=1;
		}
		System.out.println(res);
		sc.close();

	}

}
