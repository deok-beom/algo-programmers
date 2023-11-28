package level0;

/*
 * 이어 붙인 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */
public class _181928 {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for (int num : num_list) {
            if (num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }

        return even + odd;
    }
}
