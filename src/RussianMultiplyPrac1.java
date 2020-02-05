import java.util.Scanner;

public class RussianMultiplyPrac1 {
    private int russianMulitply(int num1, int num2){

        int accumulator = 0;
        while (num1 != 0){
            if(num1 % 2 == 1){
                accumulator += num2;
            }
            num1 = num1 / 2;
            num2 = num2 * 2;
        }

        return accumulator;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter another integer: ");
        int num2 = input.nextInt();
        RussianMultiplyPrac1 multiply = new RussianMultiplyPrac1();
        System.out.println("The answer is: " + multiply.russianMulitply(num1, num2));

    }

}

