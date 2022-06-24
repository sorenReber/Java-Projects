package ReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reading {
    String inventory = "";
    public String reader(){
        try{
            File previousFile = new File("Inventory.txt");
            Scanner readFile = new Scanner(previousFile);
            // Read the file and add each line to the inventory variable.
            while(readFile.hasNextLine()) {
                inventory += readFile.nextLine()+"\n";
            }
            readFile.close();
        } catch (IOException e) {
            System.out.println("It done messed up.");
            e.printStackTrace();
        }
        return inventory;
    }
}
