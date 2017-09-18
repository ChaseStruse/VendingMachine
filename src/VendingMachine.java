/**
 * Created by Chase Struse on 9/16/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

    float totalMoneyPutIntoMachine;
    float totalChangeGivenBack;
    float totalOfPurchase;

    float quarter = .25f;
    float dime = 0.10f;
    float nickel = 0.05f;

    int amountOfQuarters = 0;
    int amountOfDimes = 0;
    int amountOfNickels = 0;

    boolean isGreaterThanZero = false;

    public String makeChange(String inputString, float total) {

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

        totalMoneyPutIntoMachine -= totalOfPurchase;

        while(!isGreaterThanZero && totalMoneyPutIntoMachine > 0) {
            if (totalMoneyPutIntoMachine >= quarter) {
                totalMoneyPutIntoMachine -= quarter;
                amountOfQuarters++;
            } else if (totalMoneyPutIntoMachine >= dime) {
                totalMoneyPutIntoMachine -= dime;
                amountOfDimes++;
            } else if (totalMoneyPutIntoMachine >= nickel) {
                totalMoneyPutIntoMachine -= nickel;
                amountOfNickels++;
            } else {
                isGreaterThanZero = true;
            }
        }


        return ("Amount of change: " + "Total Quarters: " + amountOfQuarters + " Total Dimes: " + amountOfDimes + " Total Nickels: " + amountOfNickels);
    }
}
