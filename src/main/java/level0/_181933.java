package level0;

/*
 * flag에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
public class _181933 {
    public int solution(int a, int b, boolean flag) {
        if (flag) {
            return a + b;
        } else {
            return a - b;
        }
    }
}
