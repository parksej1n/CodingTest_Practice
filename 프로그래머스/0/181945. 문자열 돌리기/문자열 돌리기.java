import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i=0; i<str.length(); i++){
            a = str.charAt(i);
            System.out.println(a);
        }

    }
}