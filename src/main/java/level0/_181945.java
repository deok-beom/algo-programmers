package level0;

import java.io.*;

/*
 * 문자열 돌리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */
public class _181945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < s.length(); i++) {
            bw.write(s.charAt(i) + System.lineSeparator());
        }

        bw.flush();
    }
}
