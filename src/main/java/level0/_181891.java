package level0;

/*
 * 순서 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */
public class _181891 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int length = num_list.length - n;
        System.arraycopy(num_list, n, answer, 0, length);
        System.arraycopy(num_list, 0, answer, length, n);

        return answer;
    }
}
