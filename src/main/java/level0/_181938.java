package level0;

/*
 * 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */
public class _181938 {
    public int solution(int a, int b) {
        int base = calculate(a, b);
        int compare = 2 * a * b;

        return Math.max(base, compare);
    }

    private int calculate(int num1, int num2) {
        String s = String.valueOf(num1) + num2;
        return Integer.parseInt(s);
    }
}
