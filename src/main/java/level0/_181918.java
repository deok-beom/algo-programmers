package level0;

import java.util.ArrayList;
import java.util.List;

/*
 * 배열 만들기 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */
public class _181918 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
                continue;
            }

            if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
