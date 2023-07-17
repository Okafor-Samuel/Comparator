import java.util.List;
import java.util.ListIterator;

public class Names implements  Comparable<Names>{
    private  String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Names obj) {
        if(name.length() == obj.name.length()){
            return 0;
        } else if (name.length() > obj.name.length()) {
            return 1;
        }else return -1;

    }
    public void printList(List<Names>list){
        ListIterator<Names>listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
