package level0;

/*
 * n보다 커질 때까지 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */
public class _181884 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                break;
            }
        }

        return answer;
    }
}
