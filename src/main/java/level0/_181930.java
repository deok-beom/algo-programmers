package level0;

import java.util.HashSet;
import java.util.Set;

/*
 * 주사위 게임 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */
public class _181930 {
    public int solution(int a, int b, int c) {
        Set<Integer> bucket = new HashSet<>();
        bucket.add(a);
        bucket.add(b);
        bucket.add(c);

        int sum = 1;
        for (int i = 1; i <= 4 - bucket.size(); i++) {
            sum *= (int) Math.round(Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }

        return sum;
    }
}
