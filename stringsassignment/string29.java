import java.util.*;
public class string29
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=s.nextLine();
		StringTokenizer st = new StringTokenizer(a," ");
		String ab= st.nextToken();
		String ab1= st.nextToken();
		String ab2= st.nextToken();
		// System.out.println(st.nextToken());  
	System.out.println(ab);
	System.out.println(ab1);
		//StringTokenizer st1 = new StringTokenizer(a," ");
		//System.out.println(st.nextToken());  
	}
}