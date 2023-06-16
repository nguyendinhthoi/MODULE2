package ss10_dsa_list.practice.simple_list;

import java.util.Arrays;

public class MyList<Element> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(Element element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public Element get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (Element) elements[i];
    }
}
