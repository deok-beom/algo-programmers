package level0;

/*
 * 수열과 구간 쿼리 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */
public class _181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = getMin(arr, queries[i][0], queries[i][1], queries[i][2]);
        }

        return answer;
    }

    private int getMin(int[] arr, int start, int end, int base) {
        QueriedNumber number = new QueriedNumber(base);
        for (int i = start; i <= end; i++) {
            number.query(arr[i]);
        }

        return number.get();
    }

    private static class QueriedNumber {
        private Integer number = -1;
        private final int base;

        public QueriedNumber(int base) {
            this.base = base;
        }

        public void query(int number) {
            if (number <= base) {
                return;
            }

            if (this.number == -1) {
                this.number = number;
                return;
            }

            this.number = Math.min(this.number, number);
        }

        public int get() {
            return this.number;
        }
    }
}
