package TaxBracket;

public class TaxBracket {
    double income;
    double taxRate;
    public TaxBracket (){

    }
    public double calculateTax(){
        return income*taxRate;
    }

}
