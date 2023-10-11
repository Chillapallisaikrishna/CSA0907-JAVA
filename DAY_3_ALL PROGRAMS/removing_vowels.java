import java.util.Scanner;
public class removing_vowels {
    public static void main(String[] args) {
System.out.println("Enter a String: ");
Scanner input=new Scanner(System.in); 
String name=input.nextLine();
System.out.print("String Without Vowels:");
 String n1=name.replaceAll("[aeiouAEIOU]","");
 System.out.println(n1);  
}}