package level0;

/*
 * 문자 리스트를 문자열로 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */
public class _181941 {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
