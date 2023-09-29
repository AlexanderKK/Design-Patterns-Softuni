package _06Strategy;

import java.util.Collections;
import java.util.Comparator;

public class ComparatorLastName implements Comparator<Person> {

    @Override
    public int compare(Person f, Person s) {
        return f.getLastName().compareTo(s.getLastName());
    }

    @Override
    public Comparator<Person> reversed() {
        return Collections.reverseOrder(this);
    }

}
