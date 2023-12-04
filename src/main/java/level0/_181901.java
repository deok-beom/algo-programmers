package level0;

/*
 * 배열 만들기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */
public class _181901 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 1; i <= answer.length; i++) {
            answer[i - 1] = k * i;
        }
        return answer;
    }
}
