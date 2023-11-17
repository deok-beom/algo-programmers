package level0;

/*
 * 문자열 겹쳐쓰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class _181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        String head = my_string.substring(0, s);
        sb.append(head);
        sb.append(overwrite_string);

        String tail = my_string.substring(s + overwrite_string.length());
        sb.append(tail);

        return sb.toString();
    }
}
