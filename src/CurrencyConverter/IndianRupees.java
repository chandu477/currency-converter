package CurrencyConverter;

public class IndianRupees implements Converter{
    @Override
    public void calculate(int amount,int convertTo) {

        switch (convertTo) {
            case 1 -> indianToIndian(amount);
            case 2 -> indianToUSDOLLAR(amount);
            case 3 -> indianToEURO(amount);
            case 4 -> indianToCanadianDollar(amount);
            case 5 -> indianToAustralianDollar(amount);
            default -> System.out.println("Invalid choice");
        }


        }

    public void indianToIndian(int amount){
        System.out.println(" The Indian amount is: "+ amount);
    }
    public void indianToUSDOLLAR(int amount){
        System.out.println(" The USD amount is: "+ 0.012109542 *amount);
    }
    public void indianToEURO(int amount){
        System.out.println(" The EURO amount is: "+ 0.012*amount);
    }
    public void indianToCanadianDollar(int amount){
        System.out.println(" The Canadian Dollar amount is: "+ 0.016*amount);
    }
    public void indianToAustralianDollar(int amount){
        System.out.println(" The Australian Dollar amount is: "+ 0.01*amount );
    }

}
