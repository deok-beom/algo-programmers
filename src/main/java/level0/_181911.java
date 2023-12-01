package level0;

/*
 * 부분 문자열 이어 붙여 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */
public class _181911 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            String part = getPart(my_strings[i], parts[i]);
            sb.append(part);
        }

        return sb.toString();
    }

    public String getPart(String my_string, int[] part) {
        return my_string.substring(part[0], part[1] + 1);
    }
}
