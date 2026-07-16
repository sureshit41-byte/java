package DAY4;

public class smallestnumbers {
    public int smallestNumber(int n) {
        int result = 0;
        while (result < n) {
            result = (result << 1) | 1;
        }
        return result;
    }
}
