package DAY8;
class ATMpolymorphism {
    void message() {
        System.out.println("Welcome");
    }
}

class SBI extends ATMpolymorphism {
    void message() {
        System.out.println("Welcome to SBI ATM");
    }

    public static void main(String[] args) {
        ATMpolymorphism a = new SBI();
        a.message();
    }
}