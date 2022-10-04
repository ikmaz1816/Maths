package math;

import java.util.Scanner;

public class PowerInLognTime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=1;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=res*a;
			}
			a=a*a;
			b>>=1;
		}
		System.out.println(res);
		sc.close();
	}

}
