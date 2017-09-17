/**
 * Created by Chase Struse on 9/16/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

    float totalMoneyPutIntoMachine;
    float totalChangeGivenBack;
    float totalOfPurchase;


    public float makeChange(String inputString, float total) {

        totalOfPurchase = total;

        if(inputString.equalsIgnoreCase("Dollar")){
            totalMoneyPutIntoMachine += 1.0f;
        }else if(inputString.equalsIgnoreCase("Quarter")){
            totalMoneyPutIntoMachine += 0.25f;
        }else if(inputString.equalsIgnoreCase("Dime")){
            totalMoneyPutIntoMachine += 0.10f;
        }else if(inputString.equalsIgnoreCase("Nickel")){
            totalMoneyPutIntoMachine += 0.05f;
        }else if(inputString.equalsIgnoreCase("Penny")){
            totalMoneyPutIntoMachine += 0.00f;
        }else{
            totalMoneyPutIntoMachine += 0.0f;
        }
        return totalOfPurchase - totalMoneyPutIntoMachine;
    }
}
