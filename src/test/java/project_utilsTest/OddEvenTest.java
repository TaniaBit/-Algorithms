package project_utilsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”

    // 1 Positive testing Happy path

    @Test
    public void testNegativeNumber_HappyPath() {
        // AAA
        // arrange
        int a = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = OddEven.oddEven(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //0 →  “Even”
    @Test
    public void testZero_HappyPath() {
        // AAA
        // arrange
        int a = 0;
        String expectedResult = "Even";

        //act
        String actualResult = OddEven.oddEven(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //222222 →  “Even”
    @Test
    public void testPositiveNumber_HappyPath() {
        // AAA
        // arrange
        int a = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = OddEven.oddEven(a);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }





}
