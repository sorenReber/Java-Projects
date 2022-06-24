package ReadWrite;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public HashMap<String, Integer> inventory = new HashMap<>();
    public ArrayList<String> productNames = new ArrayList<>();

    public void getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of products you wish to enter: ");
        int numberOfAdditions = userInput.nextInt();
        for (int i =0; i < numberOfAdditions; i++){
            // Loop to be able to enter in multiple products.
            if (i == 0){
                System.out.println("Enter a product, then it's amount in stock.\nex. apples \n12");
            } else {
                System.out.println("Enter a product, then it's amount in stock: ");
            }
            String productName = userInput.next();
            int quantity = userInput.nextInt();
            inventory.put(productName, quantity);
            productNames.add(productName);
        }
    }
}
