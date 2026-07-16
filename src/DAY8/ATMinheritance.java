package DAY8;
class ATM {
    void withdraw() {
        System.out.println("Withdraw Money");
    }
}

class User extends ATM {
    public static void main(String[] args) {
        User u = new User();
        u.withdraw();
    }
}