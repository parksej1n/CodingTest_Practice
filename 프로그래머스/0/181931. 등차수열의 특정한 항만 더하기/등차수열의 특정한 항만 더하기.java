class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true)
                answer += a + i*d;
        }
        return answer;
    }
}