import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();
        String result = "";

        for (int i=0 ; i<input.length(); i++){
            char a = input.charAt(i);
            if (Character.isLowerCase(a)){
                result += Character.toUpperCase(a);
            }
            else {
                result += Character.toLowerCase(a);
            }
        }
        System.out.println(result);
    }
}