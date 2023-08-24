import org.example.PlayingWithFunctions;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test()
    {
        System.out.println("Hello world.");
    }

    @Test
    public void test2()
    {
        PlayingWithFunctions.computeTriangleArea(2.0,4.0, true);
    }
    @Test
    public void test3()
    {
        PlayingWithFunctions.printSumMultiplyDivisionDifference(3,10);
    }
    @Test
    public void testprintSumGreaterThen2()
    {
        PlayingWithFunctions.printSumGreaterThen2(4.0,1.0,true);
    }
}
