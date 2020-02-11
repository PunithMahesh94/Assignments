import java.util.*;
public class program3{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			a=(a%2==0)?even:odd;
			System.out.println(a);
			}
}