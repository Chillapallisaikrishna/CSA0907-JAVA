import java.util.Scanner;
public class Factorial{
public static void main (String [] args){
System.out.print("Enter a Number:");
Scanner input=new Scanner(System.in); 
    int n=input.nextInt();    
 int fact=1;    
 for(int i=1;i<=n;i++)  
   {        
 fact=fact*i; 
    }   
System.out.print("factorial: ");
  System.out.print(fact); 
}
}