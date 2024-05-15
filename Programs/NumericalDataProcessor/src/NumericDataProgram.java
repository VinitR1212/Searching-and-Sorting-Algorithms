import java.util.Scanner;
import java.util.Arrays;

public class NumericDataProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the data:");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        
        NumericDataManager dataManager = new NumericDataManager(capacity);
        System.out.println("Enter data to add (one per line):");
        for (int i = 0; i < capacity; i++) {
            int value = scanner.nextInt();
            dataManager.addData(value);
        }
        dataManager.sortData();
        dataManager.printData();
        
        System.out.println("Enter data to search:");
        int searchData = scanner.nextInt();
        if (dataManager.searchData(searchData)) {
            System.out.println("Data found in the list.");
        } else {
            System.out.println("Data not found in the list.");
        }

        scanner.close();
    }
    
}
