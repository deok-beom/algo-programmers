package level0;

/*
 * 9로 나눈 나머지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */
public class _181914 {
    public int solution(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }

        return sum % 9;
    }
}
