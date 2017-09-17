import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Chase Struse on 9/16/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachineTest {

    @Test
    public void whenMakeChangeIsPassedAFloatItReturnThatFloat(){
        VendingMachine vendingMachine = new VendingMachine();

        float inputNumber = 1.0f;
        assertEquals(1.0f, vendingMachine.makeChange(inputNumber));
    }

}
