package level0;

/*
 * n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */
public class _181937 {
    public int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
