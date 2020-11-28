public class TryItOut {
    public static void main(String[] args) {
        System.out.println("Try it out class");

        //Declare some variables
        int cupsOfCoffeeMonday;
        int cupsOfCoffeeTuesday;
        int cupsOfCoffeeWednesday;
        int cupsOfCoffeeThursday;
        int cupsOfCoffeeFriday;

        //Assign some values
        cupsOfCoffeeMonday = 4;
        cupsOfCoffeeTuesday = 3;
        cupsOfCoffeeWednesday = 6;
        cupsOfCoffeeThursday = 5;
        cupsOfCoffeeFriday = 4;

        //print a variable
        System.out.println(cupsOfCoffeeFriday);

        //long vs int and some considerations
        //The L at the end of the large numbers allows the literal to be a long instead of an int
        long jeffBezosIncome = 116900000000L;
        long billGatesIncome = 99900000000L;
        long myIncome = 100;

        long unitedStatesGDP = 50540000000000L;
        long chinaGDP = 13610000000000L;

        //Real Numbers - Floats and Doubles

        double a = 0.2;
        double b = 0.4;
        double c = a * b;
        // Expecting c=0.08, but we get 0.0800000...2 due to rounding errors with floating point numbers
        System.out.println(c);

        //Just like longs, the default is double so to make a float add "F" after the literal
        float temperature = 58.4F;
    }
}
