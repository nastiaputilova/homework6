package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] allSpending = new int [30];
        int sum = 0;
        for (int i= 0; i < allSpending.length; i ++){
            allSpending[i] = (int) Math.round((Math.random()*100_000)+100_000);
            sum = sum + allSpending [i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей"); {

        int max = allSpending[0];
        int min = allSpending[0];


        for (int b = 0; b < allSpending.length; b++) {
            if (max < allSpending[b])
                min = allSpending[b];
            if (max > allSpending[b])
                min = allSpending[b];
        }

        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей");

    }

        { float a = 0f;
            for (int index = 0; index < allSpending.length; index++) {
                a += allSpending[index];
            }
            float average = a/allSpending.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        }



    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);



            }

    }



    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }




    }

