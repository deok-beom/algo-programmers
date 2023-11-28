package level0;

/*
 * 수열과 구간 쿼리 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */
public class _181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            swap(arr, query[0], query[1]);
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
