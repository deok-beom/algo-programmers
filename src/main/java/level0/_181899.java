package level0;

/*
 * 카운트 다운
 * https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */
public class _181899 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for (int i = 0; start >= end_num; i++) {
            answer[i] = start--;
        }

        return answer;
    }
}
