import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Chase Struse on 9/16/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachineTest {

    VendingMachine vendingMachine = new VendingMachine();

    public String dollar = "Dollar";
    public String quarter = "Quarter";
    public String nickel = "Nickel";
    public String penny = "Penny";
    public float total = 1.25f;
    /*
    @Test
    public void whenMakeChangeIsPassedAFloatItReturnThatFloat(){
        float inputNumber = 1.0f;
        assertEquals(1.0f, vendingMachine.makeChange());
    }
    */
    @Test
    public void whenMakeChangeIsPassedANameOfACoinItAddsThatCoinsValueToAFloat(){
        assertEquals(0.25f, vendingMachine.makeChange(quarter, 0.50f));
    }
    @Test
    public void whenMakeChangeIsPassedATotalItReturnsTheTotalMinusTheChangePutIn(){
        assertEquals(1.0f, vendingMachine.makeChange(quarter, total));
    }

    @Test
    public void makeChangeWillReturnTheNameOfTheCoinsForTheChange(){
        assertEquals("Amount of change: Total Quarters: 4", vendingMachine.makeChange(quarter,total));
    }

    @Test
    public void makeChangeCanDifferentiateBetweenQuartersDimesAndNickels(){
        assertEquals("Amount of change: Total Quarters: 1 Total Dimes: 1 Total Nickels: 1", vendingMachine.makeChange("Dollar", .55f));
    }

    @Test
    public void makeChangeDoesNotIncludePennies(){
        assertEquals("Amount of change: Total Quarters: 0 Total Dimes: 0 Total Nickels: 0 Amount in change tray: 1 pennies", vendingMachine.makeChange("Penny", .55f));
    }
}
