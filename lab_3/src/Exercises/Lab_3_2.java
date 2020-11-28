package Exercises;

import java.util.Scanner;

public class Lab_3_2 extends Lab{

    @Override
    public void execute() {
        System.out.println("Please, enter fibonacci sequence length:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int[] result = fillArrayWithFibonacci(amount);
        writer.writeArray(result);
    }

    private int[] fillArrayWithFibonacci(int amount){
        int[] result = new int[amount];

        if (amount > 0){

            result[0] = 0;
            if (amount > 1){

                result[1] = 1;
                for (int i = 2; i < result.length; i++){
                    result[i] = result[i - 1] + result[i - 2];
                }
            }
        }

        return result;
    }
}
