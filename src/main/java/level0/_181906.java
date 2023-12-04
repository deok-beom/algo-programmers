package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 접두사인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */
public class _181906 {
    public int solution(String my_string, String is_prefix) {
        List<String> prefixes = IntStream.range(1, my_string.length())
                .mapToObj((i) -> my_string.substring(0, i))
                .collect(Collectors.toList());

        if (prefixes.contains(is_prefix)) {
            return 1;
        }

        return 0;
    }
}
