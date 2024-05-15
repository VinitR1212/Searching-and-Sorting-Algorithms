import java.util.Scanner;

public class StringListProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the list:");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        StringListManager listManager = new StringListManager(capacity);

        System.out.println("Enter items to add to the list (one per line):");
        for (int i = 0; i < capacity; i++) {
            String item = scanner.nextLine();
            listManager.addItem(item);
        }

        System.out.println("Enter item to search:");
        String searchItem = scanner.nextLine();
        if (listManager.searchItem(searchItem)) {
            System.out.println("Item is already on the list.");
        } else {
            System.out.println("Item is not on the list. Do you want to add it? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                listManager.addItem(searchItem);
            }
        }
        listManager.printList();
        listManager.sortList();
        System.out.println("\nSorted List:");
        listManager.printList();

        scanner.close();
    }
    
}
