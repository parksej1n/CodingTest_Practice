class Solution {
    public static String solution(String my_string, int k){
        String answer = "";
        for (int i=0; i<k; i++){
            answer += my_string;
        }
        return answer;
    }
    public static void main(String[] args){
        String str1 = solution("string", 3);
        String str2 = solution("love", 10);
        System.out.println(str1);
        System.out.println(str2);
    }
}