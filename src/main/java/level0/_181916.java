package level0;

public class _181916 {
    public int solution(int a, int b, int c, int d) {
        Dice[] dices = createDices(a, b, c, d);
        if (dices.length == 1) {
            return dices[0].number * 1111;
        }

        if (dices.length == 2) {
            int p;
            int q;
            if (dices[0].count == 2) {
                p = dices[0].number;
                q = dices[1].number;
                return (p + q) * (q - p);
            }

            if (dices[0].count == 3) {
                p = dices[0].number;
                q = dices[1].number;
            } else {
                p = dices[1].number;
                q = dices[0].number;
            }

            return (int) Math.pow(10 * p + q, 2);
        }

        if (dices.length == 3) {
            int result = 1;
            for (Dice dice : dices) {
                if (dice.count == 1) {
                    result = result * dice.number;
                }
            }

            return result;
        }

        if (dices.length == 4) {
            return dices[0].number;
        }

        return 0;
    }

    private Dice[] createDices(int... numbers) {
        int[] counts = new int[7];
        for (int number : numbers) {
            counts[number] = counts[number] + 1;
        }

        int size = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                size++;
            }
        }

        Dice[] dices = new Dice[size];

        int index = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                Dice dice = new Dice(i, counts[i]);
                dices[index] = dice;
                index++;
            }
        }

        return dices;
    }

    private static class Dice {
        private final int number;
        private final int count;

        public Dice(int number, int count) {
            this.number = number;
            this.count = count;
        }
    }
}
