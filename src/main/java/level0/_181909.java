package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 접미사 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */
public class _181909 {
    public String[] solution(String my_string) {
        List<String> suffixes = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            String suffix = my_string.substring(i);
            suffixes.add(suffix);
        }

        Collections.sort(suffixes);
        return suffixes.toArray(new String[0]);
    }
}
