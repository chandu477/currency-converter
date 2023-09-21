package CurrencyConverter;

public class Usd implements Converter {
    @Override
    public void calculate(int amount, int convertTo) {
        switch (convertTo) {
            case 1 -> usdToIndian(amount);
            case 2 -> usdToUsDOLLAR(amount);
            case 3 -> usdToEURO(amount);
            case 4 -> usdToCanadianDollar(amount);
            case 5 -> usdToAustralianDollar(amount);
            default -> System.out.println("Invalid choice");
        }


    }

    public void usdToIndian(int amount) {
        System.out.println(" The Indian amount is: " + 82.55 * amount);
    }

    public void usdToUsDOLLAR(int amount) {
        System.out.println(" The USD amount is: " + amount);
    }

    public void usdToEURO(int amount) {
        System.out.println(" The EURO amount is: " + 0.92 * amount);
    }

    public void usdToCanadianDollar(int amount) {
        System.out.println(" The Canadian Dollar amount is: " + 1.36 * amount);
    }

    public void usdToAustralianDollar(int amount) {
        System.out.println(" The Australian Dollar amount is: " + 1.56 * amount);
    }


}
