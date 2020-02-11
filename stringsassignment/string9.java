import java.util.Scanner; 
public class string9
{
			public static void main(String args[]){
				          Scanner sc = new Scanner(System.in);
					      System.out.println("Enter a string:");
						  String a = sc.nextLine();
						  if(a.charAt(0)=='-')
						  {
							  System.out.println(a.substring(1));
						  }
						  else
						  {
							  System.out.println("-1"); 
						  }
				    }
}