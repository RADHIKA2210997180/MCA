import java.util.Scanner;
public class Compare{
    boolean check(String s1,String s2){
        if(s1.length() != s2.length()){
        return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First String :");
    String str1 = sc.nextLine();
    System.out.print("Enter Second String :");
    String str2 = sc.nextLine();
    Compare c1 = new Compare();
    boolean result = c1.check(str1, str2);
    System.out.print(result);

    boolean result2 = str1.equals(str2);
    System.out.print(result2);
    }
}