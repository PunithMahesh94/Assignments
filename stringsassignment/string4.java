import java.util.*;
import java.util.Scanner;
public class string4{
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int s3=s1.length();
		int s4=s2.length();
		if(s3==s4)
		{
			String s5=s1.concat(s2);
			System.out.println("After concatination:" +s5);
		}
		else if(s3>s4)
		{
			String s6= s1.substring(s3-s4);
			System.out.println("After concatination:" +s6.concat(s2));
		}
		else if(s3<s4)
		{
			String s7= s2.substring(s4-s3);
			System.out.println("After concatination:" +s1.concat(s7));
		}
	}

}
