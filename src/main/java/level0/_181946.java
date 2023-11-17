package level0;

import java.io.*;

/*
 * 문자열 붙여서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181946
 */
public class _181946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().replaceAll(" ", "");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(s);
        bw.flush();
    }
}
