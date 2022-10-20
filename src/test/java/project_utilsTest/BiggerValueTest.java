package project_utilsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;
import project_utils.OddEven;

public class BiggerValueTest {

    //Test Data:
    //3333, 9999
    //Expected Result = 9999


    @Test
    public void testTwoPositiveNumbers_HappyPath() {
        // AAA
        // arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = BiggerValue.biggerValue(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test Data:
    //-3333, -9999
    //Expected Result = -3333


    @Test
    public void testTwoNegativeNumber_HappyPath() {
        // AAA
        // arrange
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        //act
        int actualResult = BiggerValue.biggerValue(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test Data:
    //-3333, -9999
    //Expected Result = -3333


    @Test
    public void testNegativeAndPositiveNumber_HappyPath() {
        // AAA
        // arrange
        int a = -27;
        int b = 1000;
        int expectedResult = 1000;

        //act
        int actualResult = BiggerValue.biggerValue(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }



}
