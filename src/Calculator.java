public class Calculator {
    public static void main(String[] args) {
        System.out.println("The bill calculator");
        int numberOfPersons = 4;

        double taxPercent = 8;
        double tipPercent = 15;

        double personOneAppetizerCost = 9.99;
        double personOneMainCost = 23.99;
        double personOneDessertCost = 10.29;
        double personOneDrinkCost = 8.50;

        double personTwoAppetizerCost = 12.99;
        double personTwoMainCost = 18.99;
        double personTwoDessertCost = 9.99;
        double personTwoDrinkCost = 4.25;

        double personThreeAppetizerCost = 10.49;
        double personThreeMainCost = 26.79;
        double personThreeDessertCost = 10.29;
        double personThreeDrinkCost = 3.75;

        double personFourAppetizerCost = 13.79;
        double personFourMainCost = 25.99;
        double personFourDessertCost = 4.49;
        double personFourDrinkCost = 7.50;

        String personOneName = "Adeline";
        String personOneAppetizer = "Stuffed Ziti Fritta";
        String personOneMain = "Shrimp Scampi";
        String personOneDessert = "Sicilian Cheesecake";
        String personOneDrink = "Raspberry Lemonade x 2";

        String personTwoName = "Brixton";
        String personTwoAppetizer = "Lasagna Fritta";
        String personTwoMain = "Fettuccine Alfredo";
        String personTwoDessert = "Lemon Cream cake";
        String personTwoDrink = "Mango-Strawberry Iced Tea";

        String personThreeName = "Cora";
        String personThreeAppetizer = "Fried Mozzarella";
        String personThreeMain = "Tour of Italy";
        String personThreeDessert = "Zeppoli";
        String personThreeDrink = "Fresh Brewed Iced Tea";

        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke x 2";

        boolean serviceWasGood = true;
        boolean splitBillEvenly = true;

        double personOneSubTotal = personOneAppetizerCost + personOneMainCost + personOneDessertCost + personOneDrinkCost;
        double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost + personTwoDessertCost + personTwoDrinkCost;
        double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost + personThreeDessertCost + personThreeDrinkCost;
        double personFourSubTotal = personFourAppetizerCost + personFourMainCost + personFourDessertCost + personFourDrinkCost;

        double personOneTaxAmount = ( taxPercent / 100 ) * personOneSubTotal;
        double personTwoTaxAmount = ( taxPercent / 100 ) * personTwoSubTotal;
        double personThreeTaxAmount = ( taxPercent / 100 ) * personThreeSubTotal;
        double personFourTaxAmount = ( taxPercent / 100 ) * personFourSubTotal;

        double personOneTipAmount = ( tipPercent / 100 ) * personOneSubTotal;
        double personTwoTipAmount = ( tipPercent / 100 ) * personTwoSubTotal;
        double personThreeTipAmount = ( tipPercent / 100 ) * personThreeSubTotal;
        double personFourTipAmount = ( tipPercent / 100 ) * personFourSubTotal;

        double personOneTotal = personOneSubTotal + personOneTipAmount + personOneTaxAmount;
        double personTwoTotal = personTwoSubTotal + personTwoTipAmount + personTwoTaxAmount;
        double personThreeTotal = personThreeSubTotal + personThreeTipAmount + personThreeTaxAmount;
        double personFourTotal = personFourSubTotal + personFourTipAmount + personFourTaxAmount;

        double entireMealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
        double entireMealTaxAmount = ( taxPercent / 100 ) + entireMealSubTotal;
        double entireMealTipAmount = ( tipPercent / 100 ) + entireMealSubTotal;
        double entireMealAfterTaxAndTip = entireMealSubTotal + entireMealTaxAmount + entireMealTipAmount;
        double entireMealSplitEvenly = entireMealAfterTaxAndTip / numberOfPersons;

        System.out.println("Total cost of the meal");
        System.out.println(entireMealAfterTaxAndTip);
        System.out.println("Amount each person pays if split evenly");
        System.out.println(entireMealSplitEvenly);
        System.out.println("If not split evenly:");
        System.out.println("Adeline");
        System.out.println(personOneTotal);
        System.out.println("Brixton");
        System.out.println(personTwoTotal);
        System.out.println("Cora");
        System.out.println(personThreeTotal);
        System.out.println("Dean");
        System.out.println(personFourTotal);
    }
}
