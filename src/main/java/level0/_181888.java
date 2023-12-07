package level0;

import java.util.stream.IntStream;

/*
 * n개 간격의 원소들
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */
public class _181888 {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length - 1) / n + 1;

        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i * n];
        }

        return answer;
    }
}
