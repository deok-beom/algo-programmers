package level0;

import java.util.Arrays;

/*
 * 마지막 두 원소
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */
public class _181927 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        int last = num_list[num_list.length - 1];
        int lastPrevious = num_list[num_list.length - 2];

        if (last > lastPrevious) {
            answer[answer.length - 1] = last - lastPrevious;
        } else {
            answer[answer.length - 1] = last * 2;
        }

        return answer;
    }
}
