package level0;

/*
 * 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class _181935 {
    public int solution(int n) {
        if (n % 2 == 0) {
            return calculateIfEven(n);
        } else {
            return calculateIfOdd(n);
        }
    }

    private int calculateIfEven(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i = i + 2) {
            sum += i * i;
        }

        return sum;
    }

    private int calculateIfOdd(int num) {
        int n = num / 2 + 1;
        return (1 + num) / 2 * n;
    }
}
