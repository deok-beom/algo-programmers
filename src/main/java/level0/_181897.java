package level0;

import java.util.ArrayList;
import java.util.List;

/*
 * 리스트 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */
public class _181897 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result = new ArrayList<>();

        int start;
        int end;
        int interval = 1;
        switch (n) {
            case 1:
                start = 0;
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                end = num_list.length - 1;
                break;
            default:
                start = slicer[0];
                end = slicer[1];
                break;
        }

        if (n == 4) {
            interval = slicer[2];
        }

        for (int i = start; i <= end; i += interval) {
            result.add(num_list[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
