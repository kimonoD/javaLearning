import org.example.OneDimensionalArray;
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
        //compute sum of 10 integers, print them all and print sum
        //after that, change 4. element to -10; and compute sum again
        //print 4. element
    }
}