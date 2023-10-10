import java.util.Scanner;
class rev{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
String name=input.nextLine();
String empty="";
int len=name.length();
for(int i=len-1;i>=0;i--)
{
empty=empty+name.charAt(i);
}
System.out.println(empty);
}
}