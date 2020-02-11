import java.util.*;
public class string22
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=s.nextLine();
		char[] ar=a.toCharArray();
		char ch;
		//int e=a.length();
	   //char s1=a.charAt(0);
	   //char s2=a.charAt(e);
		//String s2=a.charAt(e);
		//System.out.println(a.replace(indexOf(0),a.indexOf(e)));
		for(int i=0;i<ar.length;i++){
		if(i==0){
	     ch=ar[0];
		 ar[0]=ar[ar.length-1];
		 ar[ar.length-1]=ch;
		}
		}
		System.out.println(ar);
		
		
		
		
	}
}