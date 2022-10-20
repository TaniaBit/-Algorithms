package project_utils;

public class BiggerValue {

    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    public static int biggerValue(int a, int b) {
        if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE || b >= Integer.MIN_VALUE && b <= Integer.MAX_VALUE) {
            if (a >= b) {

                return a;
            } else {

                return b;
            }
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

    }
}
