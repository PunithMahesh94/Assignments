import java.util.Scanner;
import java.util.*;
public class series{
    public static void main(String args[]) {
      int A,B;
      Scanner s=new Scanner(System.in);
       System.out.println("ENTER A AND B VALUES");
         A=s.nextInt();
         B=s.nextInt();
          for(int i=A;i<=B;i++)
          System.out.println(i);
    }
}