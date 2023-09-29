package _06Strategy;

import java.util.Collections;
import java.util.Comparator;

public class ComparatorFirstName implements Comparator<Person> {

    @Override
    public int compare(Person f, Person s) {
        return f.getFirstName().compareTo(s.getFirstName());
    }

    @Override
    public Comparator<Person> reversed() {
        return Collections.reverseOrder(this);
    }

}
