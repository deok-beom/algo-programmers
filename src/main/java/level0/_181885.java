package level0;

import java.util.ArrayList;
import java.util.List;

/*
 * 할 일 목록
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */
public class _181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }

        return answer.toArray(new String[0]);
    }
}
