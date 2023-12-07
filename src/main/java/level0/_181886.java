package level0;

/*
 * 5명씩
 * https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */
public class _181886 {
    public String[] solution(String[] names) {
        int size = (names.length - 1) / 5 + 1;

        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            answer[i] = names[i * 5];
        }

        return answer;
    }
}
