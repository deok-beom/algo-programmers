package level0;

/*
 * 문자열 여러 번 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */
public class _181913 {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            my_string = reverse(my_string, query);
        }

        return my_string;
    }

    private String reverse(String my_string, int[] query) {
        int s = query[0];
        int e = query[1];

        String head = my_string.substring(0, s);
        String tail = my_string.substring(e + 1);

        StringBuilder sb = new StringBuilder();
        sb.append(head);
        for (int i = e; i >= s; i--) {
                sb.append(my_string.charAt(i));
        }
        sb.append(tail);

        return sb.toString();
    }
}
