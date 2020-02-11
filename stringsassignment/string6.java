import java.util.*;
public class string6 {
	
	public static void main(String args[]) {
		int count =  0;
		
		Scanner str  = new Scanner(System.in);
		
		System.out.print("Enter first String  : ");
		String str1=str.nextLine();
		
		System.out.print("Enter second String  : ");
		String str2=str.nextLine();
		
		System.out.println("String 1 :- "+str1);
		System.out.println("String 2 :- "+str2);
		if (str1.length()==str2.length())
		{
		for (int i =0 ;i<str1.length();i++) {
		if (str1.contains("--") && str2.contains("--") && str1.indexOf("--")==str2.indexOf("--")&&str1.charAt(i)==str2.charAt(i))
		{
			
			count++;
		}
		}
		}
		
		else System.out.print("False1");
		
		if (count>2&&count%2==0)
		{
			
			System.out.println("True");
			
		}else System.out.println("False");
	}
	
	

}