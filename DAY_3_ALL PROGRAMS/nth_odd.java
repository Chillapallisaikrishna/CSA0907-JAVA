import java.util.Scanner;
public class nth_odd{
public static void main(String[] args){
System.out.print("Enter n value: ");
Scanner input=new Scanner(System.in); 
int n=input.nextInt(); 
int arr[]=new int[100];
 int j=1; 
for(int i=1;i<100;i++) {   
  if(i%2!=0) {   
      arr[j] = i;   
      j++;    
 } }
System.out.println(n+"th odd number after "+n+"odd numbers");
 System.out.print(arr[n*2]);
}} 