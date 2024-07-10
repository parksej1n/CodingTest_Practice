class Solution {
    public static int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] %  2 == 0) {
                a += String.valueOf(num_list[i]);
            }
            else
                b += String.valueOf(num_list[i]);
        }
        answer = Integer.valueOf(a) + Integer.valueOf(b);
        return answer;
    }
}