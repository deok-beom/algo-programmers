package level0;

/*
 * 배열 만들기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */
public class _181895 {
    public int[] solution(int[] arr, int[][] intervals) {

        int size = 0;
        for (int[] interval : intervals) {
            size += interval[1] - interval[0] + 1;
        }

        int[] answer = new int[size];
        int desPos = 0;
        for (int[] interval : intervals) {
            int length = interval[1] - interval[0] + 1;
            System.arraycopy(arr, interval[0], answer, desPos, length);
            desPos += length;
        }

        return answer;
    }
}
