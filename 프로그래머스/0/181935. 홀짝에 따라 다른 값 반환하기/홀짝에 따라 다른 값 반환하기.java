class Solution {
    public static int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i<=n; i+=2)
                answer += i;
        }
        else {
            for (int k = 0; k<=n; k+=2)
                answer += k*k;
        }
        return answer;
    }
}