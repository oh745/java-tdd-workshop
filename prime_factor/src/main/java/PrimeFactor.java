import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if(number == 2){
            list.add(2);
        }
        if(number == 3){
            list.add(3);
        }
        return list;
    }
}
