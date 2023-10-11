import java.util.Scanner;
public class intrest {
public static void main(String[] args){
Scanner input = new Scanner(System.in); 
System.out.println("Enter price: ");
int pri=input.nextInt();
System.out.println("Enter no of years: ");
 int year=input.nextInt();
System.out.println("Is a senior citizen(y/n): ");
 char age=input.next().charAt(0); 
double interest=0.0;
 
if(age=='y') { 
    interest=(pri*year*0.12)/100;
System.out.println("interest:");   
  System.out.print(interest); 
}
 else {  
   interest=(pri*year*0.1)/100; 
System.out.println("interest:" +interest);
    System.out.print(interest); 
}   }
 
}