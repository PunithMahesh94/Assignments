import java.util.*;
public class string2{
		public static void main(String[] args){
		boolean stmt1 = "hello" == "hello";
		boolean stmt2 = new String("hello") == new String("hello");
		boolean stmt3 = new String("hello") == new String("hello");
		System.out.println(stmt1 && stmt2 || stmt3);
		}
}