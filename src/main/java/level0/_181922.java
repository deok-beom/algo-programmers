package level0;

/*
 * 수열과 구간 쿼리 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922
 */
public class _181922 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            query(arr, query[0], query[1], query[2]);
        }

        return arr;
    }

    private void query(int[] arr, int start, int end, int base) {
        for (int i = start; i <= end; i++) {
            if (i % base == 0) {
                arr[i] = arr[i] + 1;
            }
        }
    }
}
