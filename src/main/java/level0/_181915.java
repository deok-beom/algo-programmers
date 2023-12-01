package level0;

/*
 * 글자 이어 붙여 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */
public class _181915 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int i : index_list) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}
