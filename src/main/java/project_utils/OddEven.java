package project_utils;

import java.util.Arrays;

public class OddEven {

    // В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”

    public static String oddEven(int a) {
        if (a % 2 == 0) {

            return "Even";
        }

        return "Odd";
    }




    public static void main(String[] args) {
        //Test Data:
        //-345 →  “Odd”
        //0 →  “Even”
        //222222 →  “Even”
       // oddEven(-345);
        System.out.println(oddEven(-345));
        System.out.println(oddEven(0));
        System.out.println(oddEven(222222));

    }
}
