import java.util.*;
public class prime{
    public static void main(String args[]){
        int a=2,i,j,c=0,p=0,n;
        Scanner s = new Scanner(System.in);
	System.out.print(a+" ");
        for(i=5;i<100;i++)
        {  

            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    p=0;
		    break;
                }
		else
			p=1;
            }	
            if(p==1)
            {   
			c++;
		       if(c%2!=0)    
                       System.out.print(i +" ");
            }
            
        }
        
    }
}
