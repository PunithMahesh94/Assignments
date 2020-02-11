import java.util.Scanner;
public class sum
{
    public static void main(String args[]){
		int n,sum = 0;
        Scanner S=new Scanner(System.in);
		
		System.out.println("Enter n");
		n=S.nextInt(); 
		if(n>19){
			
		System.out.println("enter n between 1 to 18");
		}
		else
		{       
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
		System.out.println("Patrick and Johnny must go in path-"+sum+" to find Alice");
		}
	}
		}
