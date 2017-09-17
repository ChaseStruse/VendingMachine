import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Chase Struse on 9/16/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachineTest {

    VendingMachine vendingMachine = new VendingMachine();
    /*
    @Test
    public void whenMakeChangeIsPassedAFloatItReturnThatFloat(){
        float inputNumber = 1.0f;
        assertEquals(1.0f, vendingMachine.makeChange());
    }
    */
    @Test
    public void whenMakeChangeIsPassedANameOfACoinItAddsThatCoinsValueToAFloat(){
        String quarter = "Quarter";
        assertEquals(0.25f, vendingMachine.makeChange(quarter, 0.50f));
    }
    @Test
    public void whenMakeChangeIsPassedATotalItReturnsTheTotalMinusTheChangePutIn(){
        String quarter = "Quarter";
        float total = 1.25f;
        assertEquals(1.0f, vendingMachine.makeChange(quarter, total));
    }

}
