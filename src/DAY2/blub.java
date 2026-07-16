package DAY2;
public class Bulb {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        BulbSwitch obj = new BulbSwitch();
        int n = 3;
        int result = obj.bulbSwitch(n);
        System.out.println("Input: n = " + n);
        System.out.println("Output: " + result);
    }
}