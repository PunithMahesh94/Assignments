import java.util.*;
public class string11{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ip address in the form a.b.c.d");
		String str=s.nextLine();
		String ab[] = str.split("\\.");
		int a=Integer.parseInt(ab[0]);
		int b=Integer.parseInt(ab[1]);
		int c=Integer.parseInt(ab[2]);
		int d=Integer.parseInt(ab[3]);
		if((a<=255) && (b<=255) && (c<=255) && (d<=255))
		{
				System.out.println("It's a Valid IP");
		}
		else
		{
				System.out.println("It's not a Valid IP");
		}
	}
}