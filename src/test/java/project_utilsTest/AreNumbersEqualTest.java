package project_utilsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;
import project_utils.OddEven;

public class AreNumbersEqualTest {

    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    @Test
    public void testNumberEqual_HappyPath() {
        // AAA
        // arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        //act
        int actualResult = AreNumbersEqual.areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNegativeAndPositiveNumber_HappyPath() {
        // AAA
        // arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        //act
        int actualResult = AreNumbersEqual.areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPositiveAndNegativeNumber_HappyPath() {
        // AAA
        // arrange
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        //act
        int actualResult = AreNumbersEqual.areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


}
