package DAY5;

public class powerofheroes {
    public int sumOfPower(int[] nums) {
        long ans = 0;
        int mod = 1000000007;

        for (int i = 0; i < nums.length; i++) {
            long power = (long) nums[i] * nums[i] * nums[i];
            ans = (ans + power) % mod;
        }

        return (int) ans;
    }
}