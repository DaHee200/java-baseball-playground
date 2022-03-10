

public class StringCalculater {


    public StringCalculater() {
    }

    public int add(int input, int sum) {
        return sum + input;
    }

    public int subtract(int input, int sum) {
        return sum - input;
    }

    public int multiply(int input, int sum) {
        return sum * input;
    }

    public int divide(int input, int sum) {
        return sum / input;
    }

    public String[] separate(String input) {
        return input.split(" ");
    }

    public int toInt(String input) {
        return Integer.parseInt(input);
    }

    public int startCalculate(char input, int sum, int num) {
        if (input == '+') {
            return add(num, sum);
        } else if (input == '-') {
            return subtract(num, sum);
        } else if (input == '*') {
            return multiply(num, sum);
        } else {
            return divide(num, sum);
        }
    }

    public int calculator(String[] list) {
        int sum = toInt(list[0]);
        for (int i = 0; i < list.length - 2; i += 2) {
            sum = startCalculate(list[i + 1].charAt(0), sum, toInt(list[i + 2]));
        }
        return sum;
    }
}
