import java.util.Scanner; 
public class string14
{
			public static void main(String args[]){
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter a string:");
		        String str = sc.nextLine();
			    String m= str.replaceAll("[aeiouAEIOU]","");
				System.out.println(m);
	   }
}