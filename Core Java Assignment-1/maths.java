import java.util.Scanner;
public class maths
{
    public static void main(String args[]){
		int n,T=0;
        Scanner S=new Scanner(System.in);
		while(T<3){
			double score=0;
		System.out.println("Enter the value of n");
        n=S.nextInt();
        double a[]=new double[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
            if(a[i]>0)
            {
                if((a[i]%2)==0)
                {
                   score-=0.5;
                }
                else  
                {
                  score+=1;  
                }
                
               
            }
            else 
                 score-=1;
                 
               
        }
        System.out.println(score);
		T++;
		}
        
    }
}

