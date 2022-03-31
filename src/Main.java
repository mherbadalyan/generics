import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        List<String> strings1 = new LinkedList<>();
        strings1.add("One");
        strings1.add("Two");
        strings1.add("Three");

        printList(intList);
        printList(strings1);

        //task2
        String[] strings = {"One", "Two", "Three"};
        Integer[] ints = {1, 2, 3};
        List<String> stringList2 = asList(strings);
        List<Integer> integerList = asList(ints);

        //task3
        System.out.println(maxValue(stringList2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }));

        //task4
        ArrayList<Number> integerList2 = new ArrayList<>();
        copy(integerList2, intList);
        System.out.println(integerList2);

        //task5
        Pair<Integer, String> pair = new DefaultPair<>(997, "Katana");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

    }

    /**
     * task 1
     * takes as parameter List and print it
     */
    private static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    /**
     * task2
     * taking as parameter array , convert it to list and return list
     */
    private static <T> ArrayList<T> asList(T[] array) {
        ArrayList<T> newList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newList.add(array[i]);
        }
        return newList;
    }

    /**
     * task3
     * returning max value of given list
     */
    private static <T> T maxValue(List<T> list, Comparator<T> comparator) {
        int size = list.size();
        T max = list.get(0);
        for (int i = 0; i < size - 2; i++) {
            if (comparator.compare(list.get(i), list.get(i + 1)) < 0) {
                max = list.get(i + 1);
            }
        }
        return max;
    }

    /**
     * task4
     * copying list2 to list1
     */
    private static <T> void copy(List<? super T> list1, List<T> list2) {
        list1.addAll(list2);
    }
}
