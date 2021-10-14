package comparators;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<User> treeSet = new TreeSet<>();
        treeSet.add(new User(1, "Anun", "Azganun", 1996));
        treeSet.add(new User(2, "Petros", "Petrosyan", 1991));
        treeSet.add(new User(3, "Poghos", "Poghosyan", 2001));
        treeSet.add(new User(4, "Grigor", "Grigoryan", 1987));

        List<User> list = new ArrayList<>(treeSet);
        Collections.sort(list);
        System.out.println("Users sorted by year of birthday: " + list.toString());

        IdCompare idCompare = new IdCompare();
        Set<User> treeSet1 = new TreeSet<>(idCompare);
        treeSet1.add(new User(45, "John", "Lennon", 1997));
        treeSet1.add(new User(16, "Barack", "Obama", 1961));
        treeSet1.add(new User(5, "Donald", "Tramp", 1946));
        System.out.println("Users sorted by ID: " + treeSet1.toString());

        FirstNameCompare firstNameCompare = new FirstNameCompare();
        List<User> list1 = new ArrayList<>(treeSet1);
        Collections.sort(list1);
        System.out.println("Users sorted by first name: " + list1.toString());

        LastNameCompare lastNameCompare = new LastNameCompare();
        List<User> list2 = new ArrayList<>(treeSet1);
        Collections.sort(list2);
        System.out.println("Users sorted by last name: " + list2.toString());
    }
}
