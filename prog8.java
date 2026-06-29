import java.util.Scanner;
class prog8{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of value:");
int n = sc.nextInt();
System.out.println("Enter the number:");
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
int max=0;
for(int num:arr){
if(num>max){
max = num;
}
}
System.out.println("Largest No:"+max);
}
}