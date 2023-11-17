package level0;

/*
 * 더 크게 합치기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class _181939 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        if (ab >= ba) {
            return ab;
        } else {
            return ba;
        }
    }
}
