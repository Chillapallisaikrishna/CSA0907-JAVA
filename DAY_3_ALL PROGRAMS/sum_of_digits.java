import java.util.Scanner;
public class sum_of_digits{
public static void main(String[] args){
System.out.print("Enter a number: ");
Scanner input=new Scanner(System.in);
 int n=input.nextInt(); 
int sum=0;
 while(n!=0) 
 
{     
int rem=n%10;    
 sum=sum+rem;  
   n=n/10;
 }
 System.out.println("sum: " +sum); 
}}