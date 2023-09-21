package CurrencyConverter;

public class AustralianDollar implements Converter {
    @Override
    public void calculate(int amount, int convertTo) {
        switch (convertTo) {
            case 1 -> australianDollarToIndian(amount);
            case 2 -> australianDollarToUsDOLLAR(amount);
            case 3 -> australianDollarToEURO(amount);
            case 4 -> australianDollarToCanadianDollar(amount);
            case 5 -> australianDollarToAustralianDollar(amount);
            default -> System.out.println("Invalid choice");
        }
    }

    public void australianDollarToIndian(int amount) {
        System.out.println(" The Indian amount is: " + 52.911 * amount);
    }

    public void australianDollarToUsDOLLAR(int amount) {
        System.out.println(" The USD amount is: " + 0.640 * amount);
    }

    public void australianDollarToEURO(int amount) {
        System.out.println(" The EURO amount is: " + 0.59 * amount);
    }

    public void australianDollarToCanadianDollar(int amount) {
        System.out.println(" The Canadian Dollar amount is: " + 0.870 * amount);
    }

    public void australianDollarToAustralianDollar(int amount) {
        System.out.println(" The Australian Dollar amount is: " + amount);
    }

}
