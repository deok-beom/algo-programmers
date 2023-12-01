package level0;

import java.util.Arrays;
import java.util.List;

/*
 * 배열 만들기 5
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */
public class _181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] result = new int[intStrs.length];
        int index = 0;
        for (String intStr : intStrs) {
            int number = toInt(intStr, s, l);
            if (number > k) {
                result[index] = number;
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }

    private int toInt(String intStr, int s, int l) {
        return Integer.parseInt(intStr.substring(s, s + l));
    }
}
