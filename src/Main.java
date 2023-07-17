import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Names> names = new LinkedList<>();
        Names student = new Names("");
        names.add( new Names("James"));
        names.add(new Names("Jessy"));
        names.add(new Names("Jane"));
        names.add(new Names("Jerry"));
        Collections.sort(names);
        student.printList(names);

    }
}