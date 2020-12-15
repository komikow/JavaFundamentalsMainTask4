package com.company;
//Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.
public class Main {

    public static void main(String[] args) {
        int sum=0;
        int[] arraySum = new int[args.length];
        for (int i=0; i< arraySum.length; i++){
            arraySum[i] = Integer.parseInt(args[i]);
        }
        for(int i=0; i< arraySum.length; i++){
            sum +=arraySum[i];
        }
        System.out.println("Сумма целых чисел аргументов командной строки равна "+sum);
    }
}