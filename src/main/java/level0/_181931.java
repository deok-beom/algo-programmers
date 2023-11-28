package level0;

/*
 * 등차수열의 특정한 항만 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */
public class _181931 {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                sum = sum + a + d * i;
            }
        }

        return sum;
    }
}
