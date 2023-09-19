import org.example.LogicOperators;
import org.example.Operators;
import org.example.RelationalOperators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOperators {
    @Test
    public void arithmeticOperators() {

        //Operators.arithmeticOperators();
        Operators.moduloOperator(1, 2);
        Operators.moduloOperator(9, 4);// 9%4 = 2 zv 1
        Operators.moduloOperator(10, 2);// 10%2 = 5 zv 0
    }

    // sprav funkciu čo vypíše či je cislo párne alebo nepárne
    @Test
    public void testIfNumberIsOddOrEven() {

        Assertions.assertEquals(true, Operators.isNumberOdd(3));
        Assertions.assertEquals(false, Operators.isNumberOdd(8));

        Assertions.assertEquals(false, Operators.isNumberEven(3));
        Assertions.assertEquals(true, Operators.isNumberEven(8));
    }

    @Test
    public void testIncrement() {

        Operators.incrementOperator();
    }

    @Test
    public void testDecrement() {

        Operators.decrementOperator();
    }

    @Test
    public void testAdditionalAssignment() {

        Operators.additionalAssignment();
    }

    @Test
    public void testSubtractionAssignment() {

        Operators.subtractionAssignment();
    }

    @Test
    public void testMultiplicationAssignment() {

        Operators.multiplicationAssignment();
    }

    @Test
    public void testDivisionAssignment() {

        Operators.divisionAssignment();
    }

    @Test
    public void testModulusAssignment() {

        Operators.modulusAssignment();
    }

    @Test
    public void testRelationalOperators() {

        RelationalOperators.all();
    }

    @Test
    public void testLogicalAnd() {
        System.out.println(LogicOperators.logicalAnd(true, false));
        System.out.println(LogicOperators.logicalAnd(true, true));
        System.out.println(LogicOperators.logicalAnd(false, true));
        System.out.println(LogicOperators.logicalAnd(false, false));

    }
}
