package ReadWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class WriteRight {
    public static void main (String[] args){
        UserInput data = new UserInput();
        Reading importedData = new Reading();
        HashMap<String, Integer> dataToWrite = data.inventory;
        ArrayList<String> productDataArray = data.productNames;
        try {
            File fileCreate = new File(("Inventory.txt"));
            if (fileCreate.createNewFile()){
                System.out.println("File successfully created.");
            }
            String readData = importedData.reader();
            data.getUserInput();
            PrintWriter fileWrite = new PrintWriter("Inventory.txt");
            fileWrite.write(readData);
            fileWrite.write((dataToWrite + "\n"));
            fileWrite.print(productDataArray);
            System.out.println("Successfully wrote to file.");
            fileWrite.close();
        } catch (IOException e){
                e.printStackTrace();
            }
    }
}

