package level0;

/*
 * 가까운 1찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */
public class _181898 {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
