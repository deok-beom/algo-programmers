package level0;

/*
 * 2의 영역
 * https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */
public class _181894 {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                end = i;
                break;
            }
        }

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                end = i;
            }
        }

        if (start == -1) {
            return new int[]{-1};
        }

        int[] answer = new int[end - start + 1];
        System.arraycopy(arr, start, answer, 0, answer.length);
        return answer;
    }
}
