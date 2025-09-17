import java.util.ArrayList;
import java.util.Comparator;

public class Mas{
    public <T> ArrayList<T> delete_duplicate(ArrayList<T> list){
        ArrayList<T> new_list = new ArrayList<>();
        for(T t : list){
            if (!new_list.contains(t)){
                new_list.add(t);
            }
        }
        return new_list;
    }

    public <T> int search_element(ArrayList<T> list, T element){
        return list.indexOf(element);
    }

    public int search_max(ArrayList<Circle> list){
        list.sort(Comparator.comparing(circle -> circle.radius));
        return list.getLast().radius;
    }
}
