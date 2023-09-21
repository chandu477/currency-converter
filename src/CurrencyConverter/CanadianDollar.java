package CurrencyConverter;

public class CanadianDollar implements Converter {
    @Override
    public void calculate(int amount, int convertTo) {

        switch (convertTo) {
            case 1 -> canadianDollarToIndian(amount);
            case 2 -> canadianDollarToUsDOLLAR(amount);
            case 3 -> canadianDollarToEURO(amount);
            case 4 -> canadianDollarToCanadianDollar(amount);
            case 5 -> canadianDollarToAustralianDollar(amount);
            default -> System.out.println("Invalid choice");
        }

    }

    public void canadianDollarToIndian(int amount) {
        System.out.println(" The Indian amount is: " + 60.65 * amount);
    }

    public void canadianDollarToUsDOLLAR(int amount) {
        System.out.println(" The USD amount is: " + 0.73 * amount);
    }

    public void canadianDollarToEURO(int amount) {
        System.out.println(" The EURO amount is: " + 0.68 * amount);
    }

    public void canadianDollarToCanadianDollar(int amount) {
        System.out.println(" The Canadian Dollar amount is: " + amount);
    }

    public void canadianDollarToAustralianDollar(int amount) {
        System.out.println(" The Australian Dollar amount is: " + 1.14 * amount);
    }

}

