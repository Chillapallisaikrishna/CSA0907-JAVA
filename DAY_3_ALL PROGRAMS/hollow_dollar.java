import java.util.Scanner;
public class hollow_dollar{
public static void main(String[] args){
Scanner input=new Scanner(System.in); 
int n=input.nextInt(); 
for(int i=1;i<=n;i++) {   
  for(int j=1;j<=n;j++)    
 {         if(i==1||j==1||i==n||j==n)    
         System.out.print("$ ");     
    else          
   System.out.print("  ");    
 }
     System.out.println();
 }  
}
}