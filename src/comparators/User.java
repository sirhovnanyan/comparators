package comparators;

import java.util.Comparator;

public class User implements Comparable<User> {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final int yearofbirth;

    public User(int id, String fname, String lname, int yearofbirth) {
        this.id = id;
        this.firstname = fname;
        this.lastname = lname;
        this.yearofbirth = yearofbirth;
    }

    public int getId() {
        return id;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(User o) {
        return this.yearofbirth - o.yearofbirth;
    }

    @Override
    public String toString() {
        return "User {" +
                " id=" + id +
                " firstname='" + firstname + '\'' +
                " lastname='" + lastname + '\'' +
                " yearofbirth=" + yearofbirth +
                '}' + "\n";
    }
}

class IdCompare implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        }
        if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class FirstNameCompare implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}

class LastNameCompare implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
