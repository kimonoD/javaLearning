import org.example.AccessModifiersExamples;
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
    @Test
    public void circumferenceOfTriangle()
    {
      PlayingWithFunctions.circumferenceOfTriangle(1,2,3,true);
    }

    @Test
    public void accessModifiers() {
        AccessModifiersExamples.publicAccess();
        //private & protected methods can not be called from other package
        //protected only from its own package
        //AccessModifiersExamples.protectedAccess();
        //private only from its own class
        //AccessModifiersExamples.privateAccess();

    }

    @Test
    public void callingInsideTest() {
        AccessModifiersExamples.callingInsideClass();

    }

}
