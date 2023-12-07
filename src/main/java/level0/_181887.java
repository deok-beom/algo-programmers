package level0;

/*
 * 홀수 vs 짝수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */
public class _181887 {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}
