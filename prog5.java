import java.util.Scanner;
class prog5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int a = sc.nextInt();
System.out.println("Enter the second number:");
int b = sc.nextInt();
System.out.println("Add:"+(a+b));
System.out.println("Sub:"+(a-b));
System.out.println("Mul:"+(a*b));
System.out.println("Div:"+(a/b));
System.out.println("Rem:"+(a%b));
}
}
