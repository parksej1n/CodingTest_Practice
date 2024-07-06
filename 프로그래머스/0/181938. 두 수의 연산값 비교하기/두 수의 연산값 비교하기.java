class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String concat = a1 + b1;
        int multiple = 2*a*b;
        int concat_i = Integer.parseInt(concat);
        if (concat_i > multiple)
            answer = concat_i;
        else
            answer = multiple;
        return answer;
    }
}