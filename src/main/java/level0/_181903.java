package level0;

/*
 * qr code
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */
public class _181903 {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < code.length(); i += q) {
            sb.append(code.charAt(i));
        }

        return sb.toString();
    }
}
