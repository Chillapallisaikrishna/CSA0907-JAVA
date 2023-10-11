import java.util.Scanner; 
public class No_of_Vowels { 
    public static void main(String[] args)  
   {
System.out.print("Enter a Sentence: ");
Scanner input=new Scanner(System.in); 
String name=input.nextLine();
 int len=name.length(); 
char a[]=new char[len];
 int vow=0;
 for(int i=0;i<len;i++) { 
    a[i]=name.charAt(i);   
  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'       ||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')       
  vow=vow+1;
 }
System.out.print("No of Vowels:");
 System.out.println(vow);
}
}