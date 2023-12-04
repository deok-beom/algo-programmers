package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 접미사인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */
public class _181908 {
    public int solution(String my_string, String is_suffix) {
        List<String> suffixes = IntStream.range(0, my_string.length())
                .mapToObj(my_string::substring)
                .collect(Collectors.toList());

        if (suffixes.contains(is_suffix)) {
            return 1;
        }

        return 0;
    }
}
