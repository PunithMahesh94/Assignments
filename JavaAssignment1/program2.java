import java.util.*;
public class program2{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a,b,c values:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int max=(a>b)?(a>c?a:c):(b>c?b:c);
			System.out.println("Max value among "+a+","+b+","+c+" is: " +max);
		}
}