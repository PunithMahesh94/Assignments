import java.util.*;
public class square
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		if(n%4==0)
			s=(n/2)*(n/2);
		else
		{
			n=n-(n%4);
			s=(n/2)*(n/2);
		}
		System.out.println(s);
	}
}