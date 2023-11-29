package level0;

import java.util.ArrayList;
import java.util.List;

/*
 * 배열 만들기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */
public class _181921 {
    public int[] solution(int l, int r) {
        int start = getStart(l);
        List<Integer> result = recursiveFind(new ArrayList<>(), l, r, start);

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int getStart(int l) {
        int digit = 0;
        while (l / 10 != 0) {
            digit++;
            l = l / 10;
        }

        return (int) Math.pow(2, digit);
    }

    public List<Integer> recursiveFind(List<Integer> result, int l, int r, int stack) {
        int fiveNumber = Integer.parseInt(Integer.toBinaryString(stack)) * 5;

        if (fiveNumber > r) {
            return result;
        }

        if (fiveNumber >= l) {
            result.add(fiveNumber);
        }

        recursiveFind(result, l, r, stack + 1);
        return result;
    }
}
