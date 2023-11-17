package level0;

/*
 * 조건 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class _181934 {
    public int solution(String ineq, String eq, int n, int m) {
        int result = 0;
        if (ineq.equals(">")) {
            result = isBigger(n, m);
        } else {
            result = isBigger(m, n);
        }

        if (eq.equals("=")) {
            result = isEqual(n, m, result);
        }

        return result;
    }

    private int isBigger(int base, int compare) {
        if (base > compare) {
            return 1;
        } else {
            return 0;
        }
    }

    private int isEqual(int base, int compare, int result) {
        if (base == compare) {
            result = 1;
        }

        return result;
    }
}
