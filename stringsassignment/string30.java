import java.util.*;
public class string30
{
	public static void main(String args[]){
		 int i =0,j=0;
        
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=s.nextLine();
		StringTokenizer st = new StringTokenizer(a," ");
		String ab= st.nextToken();
		String ab1= st.nextToken();
        for(i = 0,j=0; i < ab.length()||j<ab1.length(); i++,j++) {
            char letter = ab.charAt(i);
            char letter1=ab1.charAt(j);
           System.out.println(letter+""+letter1);
        }
		

		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=s.nextLine();
		StringTokenizer st = new StringTokenizer(a," ");
		String ab= st.nextToken();
		String ab1= st.nextToken();
		String ab2= st.nextToken();
		
		
		char[] ar=ab.toCharArray();
		String c=ab.charAt[0];
		System.out.println(c);
		//char ch;
		//System.out.println(a.charAt[0]+a.charAt[2]);
	//System.out.println(ab);
	//System.out.println(ab1);*/
	
	//}
//}