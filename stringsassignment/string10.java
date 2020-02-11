import java.util.*;
public class string10
{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		String s=new String();
		System.out.println("Enter a string");
	    s = a.nextLine();
		String str=new String();
		int len= s.length();
		for(int i=0;i<len;i++)
		{
			char c = s.charAt(i);
			if(str.indexOf(c)<0)
			{
				str +=c;
			}
		}
        
		System.out.println(str);
	}
	
}