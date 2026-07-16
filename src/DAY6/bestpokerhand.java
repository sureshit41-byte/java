package DAY6;
class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        boolean flush = true;

        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }

        if (flush) {
            return "Flush";
        }

        int[] count = new int[14];

        for (int r : ranks) {
            count[r]++;
        }

        int max = 0;

        for (int c : count) {
            if (c > max) {
                max = c;
            }
        }

        if (max >= 3)
            return "Three of a Kind";
        if (max == 2)
            return "Pair";

        return "High Card";
    }
}