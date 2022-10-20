package project_utilsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.IsPositiveNumber;
import project_utils.OddEven;

public class IsPositiveNumberTest {

    //Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void testPositiveNumber_HappyPath() {
        // AAA
        // arrange
        int a = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNegativeNumber_HappyPath() {
        // AAA
        // arrange
        int a = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testZeroNumber_HappyPath() {
        // AAA
        // arrange
        int a = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = IsPositiveNumber.IsPositiveNumber(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }



}
