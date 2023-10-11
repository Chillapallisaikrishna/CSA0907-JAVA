import java.util.Scanner;
public class sqrt_pattern{
public static void main(String[] args){
System.out.print("Enter pattern range: ");
Scanner input=new Scanner(System.in);
 int n=input.nextInt(); 
int k=1;
 for(int i=1;i<=n;i++) {  
   for(int j=1;j<=i;j++)     { 
        System.out.print(k*k+" ");     
    k++;  
   }   
  System.out.println(); 
}
}
} 