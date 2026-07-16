package DAY2;

public class summax {
        public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
            if (k <= numOnes) {
                return k;
            } else if (k <= numOnes + numZeros) {
                return numOnes;
            } else {
                int remaining = k - numOnes - numZeros;
                return numOnes - remaining;
            }
        }

        public static void main(String[] args) {
            KItemsMaxSum obj = new KItemsMaxSum();
            int numOnes = 3, numZeros = 2, numNegOnes = 0, k = 2;
            int result = obj.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);
            System.out.println("Input: numOnes=" + numOnes + ", numZeros=" + numZeros +
                    ", numNegOnes=" + numNegOnes + ", k=" + k);
            System.out.println("Output: " + result);
        }
    }
}
