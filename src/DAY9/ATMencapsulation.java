package DAY9;
class ATMencapsulation {
    private int pin = 1234;

    public void setPin(int p) {
        pin = p;
    }

    public int getPin() {
        return pin;
    }

    public static void main(String[] args) {
        ATMencapsulation a = new ATMencapsulation();
        a.setPin(5678);
        System.out.println(a.getPin());
    }
}