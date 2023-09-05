import org.example.OneDimensionalArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingArray {

    @Test

    public void test() {
        OneDimensionalArray.declarationWithAllocation();
        OneDimensionalArray.initialisation();
    }

    @Test
    public void test1() {
        OneDimensionalArray.declarationWithAssignment();
    }

    @Test
    public void test3() {
        OneDimensionalArray.iteratingOverArray();
    }

    @Test
    public void testHomework() {

        OneDimensionalArray.sumViaStream();
        //compute sum of 10 integers, print them all and print sum
        //after that, change 4. element to -10; and compute sum again
        //print 4. element
    }

    @Test
    public void testSum() {

        Assertions.assertEquals(55, OneDimensionalArray.sumViaRawLoop());
    }

    @Test
    public void testSum2() {

        Assertions.assertEquals(55, OneDimensionalArray.sumViaSimpleForLoop());
    }

    @Test
    public void testHomeWork_findMin() {

        int[] array = {4,3,1};
        Assertions.assertEquals(1, OneDimensionalArray.findMin(array));

        array = new int[]{4, 3, -31, 2};
        Assertions.assertEquals(-31, OneDimensionalArray.findMin(array));

        int[] array2 = {40, 20, 30, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(4, OneDimensionalArray.findMin(array2));
    }
}