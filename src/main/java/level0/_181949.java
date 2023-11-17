package level0;

import java.io.*;

/*
 * 대소문자 바꿔서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class _181949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < s.length(); i++) {
            char c = convertCase(s.charAt(i));
            bw.write(c);
        }

        bw.flush();
    }

    private static char convertCase(char c) {
        if (65 <= c && c <= 90) {
            return (char) (c + 32);
        } else {
            return (char) (c - 32);
        }
    }
}
