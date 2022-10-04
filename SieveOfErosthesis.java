package math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErosthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=(int)Math.sqrt(a);
		boolean[] arr=new boolean[a+1];
		Arrays.fill(arr, true);
		for(int i=2;i<arr.length;i++)
		{
			for(int j=i*2;j<arr.length;j+=i)
			{
				arr[j]=false;
			}
			if(i==n+1)
				break;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
