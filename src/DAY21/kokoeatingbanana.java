package DAY21;

public class kokoeatingbanana {
        public int minEatingSpeed(int[] piles, int h) {

            int max = 0;

            for (int pile : piles) {
                if (pile > max)
                    max = pile;
            }

            for (int k = 1; k <= max; k++) {

                int hours = 0;

                for (int pile : piles) {
                    hours += (pile + k - 1) / k;
                }

                if (hours <= h)
                    return k;
            }

            return max;
        }
    }
