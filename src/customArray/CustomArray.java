package customArray;

import java.util.Arrays;

public class CustomArray {
    int size;
    int arr[];

    public CustomArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
        size++;
    }

    public void append(int value) {
        if (size == arr.length) {
            int newArr[] = new int[arr.length * 2];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Array index out of Bounds");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(10);

        array.set(0, 12);
        array.set(1, 14);
        array.set(2, 16);
        System.out.println(array.get(1));
        System.out.println(array.size());
        array.append(18);
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
    }
}
