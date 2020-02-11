import java.util.*;
public class string17
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=new String();
		String b=new String();
		System.out.println("Enter first string");
	    a = s.nextLine();
		System.out.println("Enter second string");
		b = s.nextLine();
		int n1 = Integer.parseInt(a.substring(5));
		int n2 = Integer.parseInt(b.substring(5));
		int n3= n1-n2;
		int n4= n3*4;
		System.out.println(n4);
		}
}