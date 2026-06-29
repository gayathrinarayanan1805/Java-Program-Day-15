import java.util.Scanner;
class prog2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
int count = String.valueOf(Math.abs(num)).length();
System.out.println("The number of digits is: " + count);
}
}

