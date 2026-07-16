package DAY2;
public class passthepillow {
    public int passThePillow(int n, int time) {
        int cycle = time % (n - 1);
        boolean forward = (time / (n - 1)) % 2 == 0;
        return forward ? (1 + cycle) : (n - cycle);
    }

    public static void main(String[] args) {
        PassThePillow obj = new PassThePillow();
        int n = 4, time = 5;
        int result = obj.passThePillow(n, time);
        System.out.println("Input: n = " + n + ", time = " + time);
        System.out.println("Output: " + result);
    }
}