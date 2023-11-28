package level0;

/*
 * 원소들의 곱과 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */
public class _181929 {
    public int solution(int[] num_list) {
        int sum = 0 ;
        int product = 1;
        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        if (product > Math.pow(sum, 2)) {
            return 0;
        } else {
            return 1;
        }
    }
}
