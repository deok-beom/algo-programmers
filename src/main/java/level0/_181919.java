package level0;

import java.util.ArrayList;
import java.util.List;

/*
 * 콜라츠 수열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */
public class _181919 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int x = n; x != 1; x = calculate(x)) {
            answer.add(x);
        }
        answer.add(1);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int calculate(int x) {
        if (x % 2 == 0) {
            return x / 2;
        }

        return 3 * x + 1;
    }
}
