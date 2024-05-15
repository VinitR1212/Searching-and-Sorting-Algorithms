import java.util.Scanner;

public class StringListManager {
    private String[] items;
    private int size;

    public StringListManager(int capacity) {
        items = new String[capacity];
        size = 0;
    }

    public void addItem(String item) {
        items[size++] = item;
    }

    public boolean searchItem(String item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void printList() {
        System.out.println("Original List:");
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    public void sortList() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    String temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}
