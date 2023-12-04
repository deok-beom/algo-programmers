package level0;

/*
 * 문자열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */
public class _181905 {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string, 0, s);
        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }
        sb.append(my_string, e + 1, my_string.length());

        return sb.toString();
    }
}
