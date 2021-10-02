import java.util.*;

public class BIG_NUMBERS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        System.out.println(bigSum(num1, num2));

    }

    public static String bigSum(String num1, String num2) {
        // checking if the first number is greater
        if (num1.length() > num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        char bigNum1[] = num1.toCharArray();
        char bigNum2[] = num2.toCharArray();
        int len1 = num1.length();
        int len2 = num2.length();
        int diff = len2 - len1;

        String result = "";

        int carry = 0;

        for (int i = len1 - 1; i >= 0; i--) {
            int n1 = (int) (bigNum1[i] - '0');
            int n2 = (int) (bigNum2[i + diff] - '0');
            int sum = n1 + n2 + carry;
            result += (sum % 10);
            carry = sum / 10;

        }

        // Now adding remaining digits of the larger number
        for (int i = len2 - len1 - 1; i >= 0; i--) {
            int n2 = (int) (bigNum2[i] - '0');
            int sum = n2 + carry;
            result += sum;
            carry = sum / 10;
        }

        // checking if there is any carry
        // and adding it

        if (carry > 0) {
            result += carry;
        }

        // reversing the result
        StringBuilder final_result = new StringBuilder(result);
        final_result.reverse();

        result = final_result.toString();

        return result;
    }
}