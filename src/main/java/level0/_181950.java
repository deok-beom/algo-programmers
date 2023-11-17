package level0;

import java.io.*;

/*
 * 문자열 반복해서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */
public class _181950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] s = input.split(" ");
        String str = s[0];
        int n = Integer.parseInt(s[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(str);
        }

        bw.flush();
    }
}
