import java.util.Scanner;
import java.util.Arrays;

public class NumericDataManager {
    private int[] data;
    private int size;

    public NumericDataManager(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void addData(int value) {
        data[size++] = value;
    }

    public boolean searchData(int value) {
        int index = Arrays.binarySearch(data, 0, size, value);
        return index >= 0;
    }

    public void printData() {
        System.out.println("Original Data:");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public void sortData() {
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }
}
