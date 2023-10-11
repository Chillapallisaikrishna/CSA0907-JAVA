import java.util.Scanner;
public class separate {
    public static void main(String[] args) {
System.out.println("Enter a word with spl characters:");
Scanner input=new Scanner(System.in); 
String s=input.nextLine();

 int len=s.length(); 
char a[]=new char[len]; 
 System.out.println("spl characters are:");
int sp=0; for(int i=0;i<len;i++) {   
  a[i]=s.charAt(i); 
    if(a[i]>=65 && a[i]<=90 ||a[i]>=97 &&a[i]<=122         || a[i]>=48 && a[i]<=57)  
   {   
  }     else     {    
     sp++;     
    System.out.print(a[i]);   
  } }
 System.out.println("\n"+sp);
}
}