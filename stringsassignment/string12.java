import java.util.Scanner; 
public class strings
{
			public static void main(String args[]){
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter a string:");
		       String s = sc.nextLine();     
			   StringBuffer sb = new StringBuffer();
               for(int i = 0;i < s.length();i++){
                    char c = s.charAt(i);
                      if(i%2 != 0){
                          c = (char)(c+1);
                          sb.append(c);
                      }
                      else
                         sb.append(c);
            }
      System.out.println(sb.toString());
      }
}