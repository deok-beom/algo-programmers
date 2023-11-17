package level0;

import java.io.*;

/*
 * 홀짝 구분하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */
public class _181944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (n % 2 == 0) {
            bw.write(n + " is even");
        } else {
            bw.write(n + " is odd");
        }

        bw.flush();
    }
}
