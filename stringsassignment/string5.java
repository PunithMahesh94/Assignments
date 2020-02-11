import java.util.*;
public class string5{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
	  System.out.println("Enter date in DD/MM/YYYY format")
      String str = s.nextLine();
      String array[] = str.split("/");
      int d,m,year,yl,l;
      l = array.length;
      if(l==3)
      {
         yl = array[2].length();  
         d = Integer.parseInt(array[0]);
         m = Integer.parseInt(array[1]);
         year = Integer.parseInt(array[2]);
         
        if(d<=31&&m<=12&&yl==4&&(year>999&&year<=9999))
           System.out.println("true");
        else
          System.out.println("false");
         
      }
    
    }
}