package level0;

/*
 * 문자열 뒤의 n글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */
public class _181910 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
