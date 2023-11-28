package level0;

import java.util.HashMap;
import java.util.Map;

/*
 * 수 조작하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */
public class _181926 {
    private static final Map<Character, Integer> CONTROL_BOARD = new HashMap<>();

    static {
        CONTROL_BOARD.put('w', 1);
        CONTROL_BOARD.put('s', -1);
        CONTROL_BOARD.put('d', 10);
        CONTROL_BOARD.put('a', -10);
    }

    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            n += CONTROL_BOARD.get(c);
        }

        return n;
    }
}
