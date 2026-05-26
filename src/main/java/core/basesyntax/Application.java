package core.basesyntax;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("Adding elements...");
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("Size after adding: " + list.size());

        System.out.println("\nAdding by index...");
        list.add("Zero", 0);
        list.add("Second and Half", 2);
        list.add("Last", list.size());

        System.out.println("Elements after additions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }

        System.out.println("\nTesting set()...");
        System.out.println("Replaced element: " + list.set("New Third", 3));
        System.out.println("New value at index 3: " + list.get(3));

        System.out.println("\nTesting addAll()...");
        list.addAll(List.of("A", "B", "C"));
        System.out.println("Size after addAll: " + list.size());
        System.out.println("\nTesting remove by index...");
        System.out.println("Removed element at index 0: " + list.remove(0));
        System.out.println("\nTesting remove by object...");
        System.out.println("Is 'Third' removed? " + list.remove("Third"));
        System.out.println("Is 'NotExisting' removed? " + list.remove("NotExisting"));

        System.out.println("\nFinal elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        System.out.println("Final size: " + list.size());
    }
}
