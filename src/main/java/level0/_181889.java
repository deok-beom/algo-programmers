package level0;

import java.util.Arrays;

/*
 * n 번째 원소까지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */
public class _181889 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
