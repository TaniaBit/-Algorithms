package project_utils;

import java.util.Arrays;

public class OddIndices {

    //Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public static String oddIndices(int[] array) {
        int[] arrayOdd = new int[(array.length)];
        for (int i = 1; i <= array.length; i += 2) {

            arrayOdd[i] = array[i];
        }

        return Arrays.toString(arrayOdd);
    }

    public static void main(String[] args) {

        //;
        System.out.println(oddIndices(new int[]{4, 5, 6, 7, 8,9}));


    }
}
