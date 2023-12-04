package level0;

/*
 * 문자 개수 세기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */
public class _181902 {
    public int[] solution(String my_string) {
        int[] result = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            count(result, my_string.charAt(i));
        }

        return result;
    }

    public void count(int[] result, char alphabet) {
        int index;
        if (Character.isUpperCase(alphabet)) {
            index  = alphabet - 'A';
        } else {
            index = alphabet - 'a' + 26;
        }

        result[index]++;
    }
}
