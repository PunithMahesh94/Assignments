import java.util.*;
public class string23
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String a=new String();
		System.out.println("Enter your String");
		 a=s.nextLine();
		StringTokenizer st = new StringTokenizer(a," ");
		int count = st.countTokens();
		 System.out.println("Number of Tokens : " +count); 
	}
}