import java.util.Scanner;
class prog9{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String original = sc.nextLine();
String reversed = new StringBuilder(original).reverse().toString();
if (original.equalsIgnoreCase(reversed)) {
System.out.println(original + " is a palindrome.");
} 
else{
System.out.println(original + " is not a palindrome.");
}
}
}