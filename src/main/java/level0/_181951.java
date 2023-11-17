package level0;

import java.io.*;

/*
 * a와 b 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181951
 */
public class _181951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] s = input.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("a = " + a + System.lineSeparator());
        bw.write("b = " + b);
        bw.flush();
    }
}
