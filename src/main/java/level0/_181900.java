package level0;

import java.util.Arrays;

/*
 * 글자 지우기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */
public class _181900 {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);

        StringBuilder sb = new StringBuilder();
        for (int i = 0, index = 0; i < my_string.length(); i++) {
            if (index < indices.length && indices[index] == i) {
                index++;
                continue;
            }

            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}
