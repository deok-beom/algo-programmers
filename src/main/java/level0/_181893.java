package level0;

import java.util.Arrays;

/*
 * 배열 조각하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */
public class _181893 {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
