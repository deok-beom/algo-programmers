package level0;

import java.util.HashMap;
import java.util.Map;

/*
 * 수 조작하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */
public class _181925 {
    private static final Map<Integer, Character> CONTROL_BOARD = new HashMap<>();

    static {
        CONTROL_BOARD.put(1, 'w');
        CONTROL_BOARD.put(-1, 's');
        CONTROL_BOARD.put(10, 'd');
        CONTROL_BOARD.put(-10, 'a');
    }

    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            Character c = CONTROL_BOARD.get(numLog[i] - numLog[i - 1]);
            sb.append(c);
        }

        return sb.toString();
    }
}
