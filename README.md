# Coffee Machine Simulator

This is a console application in Java that simulates a coffee machine. It allows users to buy different types of coffee, fill the machine with ingredients, take the money earned, and view the current ingredient levels.

## Features

The Coffee Machine Simulator offers the following features:

- Buy Coffee: Users can choose from different types of coffee (Espresso, Latte, Cappuccino) and buy them. The machine checks if there are enough ingredients to make the selected coffee and dispenses it if possible.

- Fill Ingredients: Users can add more water, milk, and coffee beans to the machine. The ingredient levels are updated accordingly.

- Take Money: The maintainer can collect the money earned from selling coffee. The money box is emptied after the transaction.

- Show Ingredients: Users can view the current levels of water, milk, and coffee beans in the machine.

- Analytics: There is an option to view the count of all coffees sold, the total earnings, and the amount of ingredients consumed.

## Coffee Types and Ingredients

The coffee machine supports the following types of coffee:

- Espresso:
  - Price: $4/cup
  - Water needed: 250 ml/cup
  - Milk needed: 0 ml/cup
  - Coffee beans needed: 16 grams/cup

- Latte:
  - Price: $7/cup
  - Water needed: 350 ml/cup
  - Milk needed: 75 ml/cup
  - Coffee beans needed: 20 grams/cup

- Cappuccino:
  - Price: $6/cup
  - Water needed: 200 ml/cup
  - Milk needed: 100 ml/cup
  - Coffee beans needed: 12 grams/cup

## Usage

1. Start the application by running the `Main` class.

2. The application will present a menu with different options. Enter the number corresponding to the desired option:

    - To buy coffee, choose option 1 and enter the type of coffee (Espresso/Latte/Cappuccino).
    - To fill ingredients, choose option 2 and enter the amount of water, milk, and coffee beans to add.
    - To take the money earned, choose option 3.
    - To show the current ingredient levels, choose option 4.
    - To exit the simulation, choose option 5.

3. Follow the prompts and instructions provided by the application.

## License

This project is licensed under the [MIT License](LICENSE).
