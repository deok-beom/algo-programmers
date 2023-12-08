package level0;

/*
 * 조건에 맞게 수열 변환하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */
public class _181882 {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num >= 50 && num % 2 == 0) {
                arr[i] = num /= 2;
                continue;
            }

            if (num < 50 && num % 2 == 1) {
                arr[i] = num *= 2;
            }
        }

        return arr;
    }
}
