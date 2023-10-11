import java.util.Scanner; 
public class Perfect_number { 
    public static void main(String[] args)  
   {
Scanner input=new Scanner(System.in); 
System.out.print("Enter a  number");
int n=input.nextInt();
 int factors=0;
 for(int i=1;i<n;i++) {    
 if(n%i==0)      
   factors=factors+i;
 } if(n==factors)     
System.out.print("It's a perfect number");
else 
System.out.println("it's not a perfect number");
}
}