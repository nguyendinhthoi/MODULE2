package ss10_dsa_list.exercise.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();

        integerMyList.add(3);
        integerMyList.add(2);
        integerMyList.add(5);
        integerMyList.add(7);



        System.out.println("The Array is:");
        integerMyList.showArray();
        System.out.println("Size of Array is " + integerMyList.size());
        System.out.println("The index of value 10 is " + integerMyList.indexOf(10));
        System.out.println("The index of value 5 is " + integerMyList.indexOf(5));
        System.out.println("The value of index 2 is " + integerMyList.get(2));
    }
}
