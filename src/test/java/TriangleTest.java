import junit.framework.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    List<Double> all_side;
    @Test
    public void test_side(){
        try{
            all_side = new ArrayList<Double>();
            all_side.add((double) 208);
            all_side.add((double) 167);
            all_side.add((double) 193);
            Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
            tri.getType();
            tri.getArea();
        }
        catch(Exception evt){
            evt.getStackTrace();

        }

    }

    @Test
    public void test_point(){

    }
}
