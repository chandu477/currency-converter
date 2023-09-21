package CurrencyConverter;

public class Euro implements Converter {
    @Override
    public void calculate(int amount, int convertTo) {
        switch (convertTo) {
            case 1 -> euroToInr(amount);
            case 2 -> euroToUSDOLLAR(amount);
            case 3 -> euroToEURO(amount);
            case 4 -> euroToCanadianDollar(amount);
            case 5 -> euroToAustralianDollar(amount);
            default -> System.out.println("Invalid choice");
        }


    }

    public void euroToInr(int amount) {
        System.out.println(" The Indian amount is: " + 89.13 * amount);
    }

    public void euroToUSDOLLAR(int amount) {
        System.out.println(" The USD amount is: " + 1.07 * amount);
    }

    public void euroToEURO(int amount) {
        System.out.println(" The EURO amount is: " + amount);
    }

    public void euroToCanadianDollar(int amount) {
        System.out.println(" The Canadian Dollar amount is: " + 1.46 * amount);
    }

    public void euroToAustralianDollar(int amount) {
        System.out.println(" The Australian Dollar amount is: " + 1.68 * amount);
    }


}