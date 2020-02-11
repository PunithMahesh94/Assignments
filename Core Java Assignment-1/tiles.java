import java.util.Scanner;
import java.util.*;
public class tiles{
    public static void main(String args[]) {
           int w,l;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the width and length of the room");
                       w = s.nextInt();
                       l = s.nextInt();
                       double a=(double)w/8;
                       double b=(double)l/8;
                       int aa=(int)a;
                       int bb=(int)b;
                       int total=aa*bb;
                        double total2=a*b;
                        double a1=(double)total2-total;
                        double ans=a1*2;
                        
                                       System.out.println(total);
                System.out.println(ans);
 
                       


     
       
        
    }
}