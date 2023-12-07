package level0;

/*
 * 수열과 구간 쿼리 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */
public class _181883 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }

        return arr;
    }
}
