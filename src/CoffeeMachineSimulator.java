public class CoffeeMachineSimulator {
    private int water;
    private int milk;
    private int beans;
    private int money;

    private int espressoWater;
    private int espressoBeans;
    private int latteWater;
    private int latteMilk;
    private int latteBeans;
    private int cappuccinoWater;
    private int cappuccinoMilk;
    private int cappuccinoBeans;

    private int espressoPrice;
    private int lattePrice;
    private int cappuccinoPrice;

    private int espressoCount;
    private int latteCount;
    private int cappuccinoCount;
    public CoffeeMachineSimulator() {
        this.water = 0;
        this.milk = 0;
        this.beans = 0;
        this.money = 0;

        this.espressoWater = 250;
        this.espressoBeans = 16;
        this.latteWater = 350;
        this. latteMilk = 75;
        this.latteBeans = 20;
        this. cappuccinoWater = 200;
        this.cappuccinoMilk = 100;
        this.cappuccinoBeans = 12;

        this.espressoPrice = 4;
        this.lattePrice = 7;
        this.cappuccinoPrice = 6;

        this.espressoCount = 0;
        this.latteCount = 0;
        this.cappuccinoCount = 0;
    }
    public void buyCoffee(String type) {
        if (type.equalsIgnoreCase("espresso")) {
            if (water >= espressoWater && beans >= espressoBeans) {
                water -= espressoWater;
                beans -= espressoBeans;
                money += espressoPrice;
                espressoCount++;
                System.out.println("Here is your Espresso. Enjoy!");
            } else {
                System.out.println("Sorry, not enough ingredients to make Espresso.");
            }
        } else if (type.equalsIgnoreCase("latte")) {
            if (water >= latteWater && milk >= latteMilk && beans >= latteBeans) {
                water -= latteWater;
                milk -= latteMilk;
                beans -= latteBeans;
                money += lattePrice;
                latteCount++;
                System.out.println("Here is your Latte. Enjoy!");
            } else {
                System.out.println("Sorry, not enough ingredients to make Latte.");
            }
        } else if (type.equalsIgnoreCase("cappuccino")) {
            if (water >= cappuccinoWater && milk >= cappuccinoMilk && beans >= cappuccinoBeans) {
                water -= cappuccinoWater;
                milk -= cappuccinoMilk;
                beans -= cappuccinoBeans;
                money += cappuccinoPrice;
                cappuccinoCount++;
                System.out.println("Here is your Cappuccino. Enjoy!");
            } else {
                System.out.println("Sorry, not enough ingredients to make Cappuccino.");
            }
        } else {
            System.out.println("Invalid coffee type.");
        }
    }
    public void fillIngredients(int waterAmount, int milkAmount, int beansAmount) {
        water += waterAmount;
        milk += milkAmount;
        beans += beansAmount;
        System.out.println("Ingredients filled successfully.");
    }

    public void takeMoney() {
        System.out.println("Taking $" + money + " from the money box.");
        money = 0;
    }
    public void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " grams");
    }

    public void showAnalytics() {
        int totalCoffees = espressoCount + latteCount + cappuccinoCount;
        int totalEarnings = espressoCount * espressoPrice + latteCount * lattePrice + cappuccinoCount * cappuccinoPrice;

        System.out.println("\n=== Coffee Machine Analytics ===");
        System.out.println("Total coffees sold: " + totalCoffees);
        System.out.println("Total earnings: $" + totalEarnings);
        System.out.println("Espresso count: " + espressoCount);
        System.out.println("Latte count: " + latteCount);
        System.out.println("Cappuccino count: " + cappuccinoCount);
    }
}