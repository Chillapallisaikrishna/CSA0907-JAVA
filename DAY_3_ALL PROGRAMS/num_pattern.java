import java.util.Scanner;
public class num_pattern{
public static void main(String[] args){
System.out.print("Enter range: ");
Scanner input=new Scanner(System.in); 
int n=input.nextInt();
 for(int i=1;i<=n;i++) {  
   for(int j=1;j<=i;j++)     {   
      System.out.print(i);    
 }     System.out.println(); 
}
}}  