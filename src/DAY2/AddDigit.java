package DAY2;
public class AddDigit {
        public int addDigits(int num) {
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }

        public static void main(String[] args) {
            AddDigits obj = new AddDigits();
            int num = 38;
            int result = obj.addDigits(num);
            System.out.println("Input: " + num);
            System.out.println("Output: " + result);
        }
    }
