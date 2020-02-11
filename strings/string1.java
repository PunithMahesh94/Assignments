
import java.util.regex.*;

 class Tester{
		public static void main(String[] args){
		String stmt = "Java is a Programming Language";
		for(String token:stmt.split("\\s")){
		System.out.print(token +" ");
	}
	}

}