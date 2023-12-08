package level0;

/*
 * 조건에 맞게 수열 변환하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */
public class _181881 {
    public int solution(int[] arr) {
        return recursiveTransform(arr, 0);
    }

    private static int recursiveTransform(int[] arr, int count) {
        boolean changed = false;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 50 && num % 2 == 0) {
                arr[i] = num / 2;
                changed = true;
                continue;
            }

            if (num < 50 && num % 2 != 0) {
                arr[i] = num * 2 + 1;
                changed = true;
            }
        }

        if (changed) {
            return recursiveTransform(arr, ++count);
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        _181881 foo = new _181881();
        int count = foo.solution(new int[]{1, 2, 3, 100, 99, 98});
        System.out.println("count = " + count);
    }
}
