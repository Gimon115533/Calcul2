import CalOP.CalculatorOP;
import CalOP.Play;
import org.junit.Assert;
import org.junit.Test;

public class Utest {

    @Test
    public void testMultiplication(){
        CalculatorOP calculatorOP=new CalculatorOP(2,4,"*");
        Assert.assertEquals(8,calculatorOP.getRez(),0);
    }
    @Test
    public void testAddition(){
        CalculatorOP calculatorOP=new CalculatorOP(2,4,"+");
        Assert.assertEquals(6,calculatorOP.getRez(),0);
    }
    @Test
    public void testSubtraction(){
        CalculatorOP calculatorOP=new CalculatorOP(2,4,"-");
        Assert.assertEquals(-2,calculatorOP.getRez(),0);
    }
    @Test
    public void testDivision(){
        CalculatorOP calculatorOP=new CalculatorOP(8,4,"/");
        Assert.assertEquals(2,calculatorOP.getRez(),0);
    }
}
