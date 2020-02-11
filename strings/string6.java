import java.util.*;
public class string6{
		public static void main(String[] args) { 
		String s1 = null;
		String s2 = null; 
		if (s1 == s2)
			System.out.print("A");
		if (s1.equals(s2))
			System.out.print("B");
	} 
}



/*  output
		AException in thread "main" java.lang.NullPointerException
        at string6.main(string6.java:8)*/