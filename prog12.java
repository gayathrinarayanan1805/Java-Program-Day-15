public class prog12 {
public static void main(String[] args) {
int num = 12345;
int originalNum = num;
int sum = 0;
while (num != 0) {
int lastDigit = num % 10;
sum += lastDigit;
num /= 10;
}
System.out.println("The sum of digits of " + originalNum + " is: " + sum);
}
}
