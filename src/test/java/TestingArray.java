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

}