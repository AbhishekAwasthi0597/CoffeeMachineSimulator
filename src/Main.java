import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     CoffeeMachineSimulator coffeeMachine = new CoffeeMachineSimulator();
     while(true){
         System.out.println("What would you like to do?");
         System.out.println("1. Buy Coffee");
         System.out.println("2. Fill Ingredients");
         System.out.println("3. Take Money");
         System.out.println("4. Show Ingredients");
         System.out.println("5. Exit");
         System.out.print("Select an option: ");
         int option = sc.nextInt();
         sc.nextLine();
         switch (option) {
             case 1:
                 System.out.print("Enter the type of coffee (Espresso/Latte/Cappuccino): ");
                 String coffeeType = sc.nextLine();
                 coffeeMachine.buyCoffee(coffeeType);
                 break;
             case 2:
                 System.out.print("Enter the amount of water to add (in ml): ");
                 int waterAmount = sc.nextInt();
                 System.out.print("Enter the amount of milk to add (in ml): ");
                 int milkAmount = sc.nextInt();
                 System.out.print("Enter the amount of beans to add (in grams): ");
                 int beansAmount = sc.nextInt();
                 coffeeMachine.fillIngredients(waterAmount, milkAmount, beansAmount);
                 break;
             case 3:
                 coffeeMachine.takeMoney();
                 break;
             case 4:
                 coffeeMachine.showIngredients();
                 break;
             case 5:
                 System.out.println("Exiting Coffee Machine Simulator...");
                 return;
             default:
                 System.out.println("Invalid option. Please try again.");
         }
      }
    }
}