package level0;

/*
 * 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class _181936 {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
