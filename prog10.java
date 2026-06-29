import java.util.Scanner;
import java.util.Arrays;
class prog10{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();
String cleanStr1 = str1.replaceAll("\\s", "").toLowerCase();
String cleanStr2 = str2.replaceAll("\\s", "").toLowerCase();
boolean isAnagram = false;
if (cleanStr1.length() == cleanStr2.length()) {
char[] charArray1 = cleanStr1.toCharArray();
char[] charArray2 = cleanStr2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
isAnagram = Arrays.equals(charArray1, charArray2);
}
if (isAnagram){
System.out.println('"' + str1 + "\" and \"" + str2 + "\" are anagrams.");
} 
else{
System.out.println('"' + str1 + "\" and \"" + str2 + "\" are not anagrams.");
}
}
}