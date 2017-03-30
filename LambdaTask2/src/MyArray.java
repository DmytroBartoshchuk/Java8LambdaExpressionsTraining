import java.util.LinkedList;
import java.util.List;

/**
 * Created by DmytroBartoshchuk on 15.03.2017.
 */
public class MyArray {

    static List<Integer>  map(List<Integer> elements, IMyArray im){

        List<Integer> result = new LinkedList<>();

        for(Integer i : elements){
            result.add(im.operation(i));
        }

        return result;
    }
}
