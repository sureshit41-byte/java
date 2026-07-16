package DAY9;
abstract class ATM {
    abstract void withdraw();
}

class SBI extends ATM {
    void withdraw() {
        System.out.println("Money Withdrawn");
    }

    public static void main(String[] args) {
        SBI s = new SBI();
        s.withdraw();
    }
}