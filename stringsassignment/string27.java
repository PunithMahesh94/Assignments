import java.util.*;
public class string27
{
	public static void main(String args[]){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=s.nextLine();
		if(a.contains("a") && a.contains("e")  && a.contains("i") && a.contains("o") && a.contains("u"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}