import java.util.Scanner;
class prog7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
int temp = num;
int sum = 0;
while(num>0){
int digit = num%10;
sum = sum+digit*digit*digit*digit;
num=num/10;
}
if(temp==sum){
System.out.println("Armstrong number");
}
else{
System.out.println("Not Armstrong");
}
}
}