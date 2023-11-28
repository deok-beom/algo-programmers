package level0;

/*
 * 코드 처리하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */
public class _181932 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = switchMode(mode);
                continue;
            }

            if (mode == 0 && i % 2 == 0) {
                sb.append(c);
                continue;
            }

            if (mode == 1 && i % 2 == 1) {
                sb.append(c);
            }
        }

        String ret = sb.toString();
        if (ret.isEmpty()) {
            return "EMPTY";
        }

        return ret;
    }

    private int switchMode(int mode) {
        if (mode == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
