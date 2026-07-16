package DAY4;
import java.util.List;
public class collectelement {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] seen = new boolean[k + 1];
        int collected = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            int val = nums.get(i);
            if (val <= k && !seen[val]) {
                seen[val] = true;
                collected++;
                if (collected == k) return nums.size() - i;
            }
        }
        return nums.size();
    }
}