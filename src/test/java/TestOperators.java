import org.example.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOperators {
    @Test
    public void arithmeticOperators() {

        //Operators.arithmeticOperators();
        Operators.moduloOperator(1,2);
        Operators.moduloOperator(9,4);// 9%4 = 2 zv 1
        Operators.moduloOperator(10,2);// 10%2 = 5 zv 0
    }
    // sprav funkciu čo vypíše či je cislo párne alebo nepárne
    @Test
    public void testIfNumberIsOddOrEven() {

        Assertions.assertEquals(true, Operators.isNumberOdd(3));
        Assertions.assertEquals(false, Operators.isNumberOdd(8));

        Assertions.assertEquals(false, Operators.isNumberEven(3));
        Assertions.assertEquals(true, Operators.isNumberEven(8));
    }



}
