import java.util.Scanner; 
public class no_of_factors { 
    public static void main(String[] args)  
   {
Scanner input=new Scanner(System.in); 
System.out.print("Enter a number: ");
int n=input.nextInt(); 
int factors=0; 
for(int i=1;i<=n;i++) { 
    if(n%i==0)  
       factors=factors+1;
 } 
System.out.print("Number of factors = "+factors);
 }
}
