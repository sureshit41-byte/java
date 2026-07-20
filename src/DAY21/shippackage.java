package DAY21;

public class shippackage {
        public int shipWithinDays(int[] weights, int days) {

            int max = 0;
            int sum = 0;

            for (int w : weights) {
                max = Math.max(max, w);
                sum += w;
            }

            for (int cap = max; cap <= sum; cap++) {

                int need = 1;
                int load = 0;

                for (int w : weights) {

                    if (load + w > cap) {
                        need++;
                        load = 0;
                    }

                    load += w;
                }

                if (need <= days)
                    return cap;
            }

            return sum;
        }
    }