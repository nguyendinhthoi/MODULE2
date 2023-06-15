package ss10_dsa_list.exercise.array_list;

import java.util.Arrays;
import java.util.Objects;

public class MyList<Element> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(int minCapa) {
        int mySize = minCapa * elements.length;
        elements = Arrays.copyOf(elements, mySize);
    }

    public void add(Element element) {
        if (size == elements.length) {
            ensureCapa(size);
        }
        elements[size++] = element;
    }

    public int size() {
        return size;
    }

    public void showArray() {
        for (int i = 0; i < size; i++) {
//            if (elements[i] != null) {
            System.out.println(elements[i]);
//            }
        }
    }

    public int indexOf(Element o) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(o, elements[i]))
                return i;
        }
        return -1;
    }


    public Element get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " Size " + index);
        }
        return (Element) elements[index];
    }
}

