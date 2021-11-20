package day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main mainObj=new Main();
        System.out.println(Arrays.toString(mainObj.createRandomOddArray()));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a positive integer:");
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber+" -> "+mainObj.roundHungarian(inputNumber));


    }
    public int[] createRandomOddArray(){
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*random.nextInt(50)+1;
        }
        return arr;
    }

    public int roundHungarian(int inputNumber){
        int output= (int) (5*Math.round(inputNumber/5.0));
        return output;
    }

}
