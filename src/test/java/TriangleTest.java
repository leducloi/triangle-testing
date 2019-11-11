import junit.framework.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    List<Double> all_side;
    double Ax, Ay, Bx, By, Cx, Cy;


    @Test
    public void test_side1(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 208);
        all_side.add((double) 167);
        all_side.add((double) 193);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side2(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 3);
        all_side.add((double) 5);
        all_side.add((double) 4);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side11(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 5);
        all_side.add((double) 4);
        all_side.add((double) 3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side12(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 4);
        all_side.add((double) 5);
        all_side.add((double) 3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side3(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 4.5);
        all_side.add((double) 5);
        all_side.add((double) 4.5);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side9(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 4.5);
        all_side.add((double) 4.5);
        all_side.add((double) 5);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side10(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 5);
        all_side.add((double) 4.5);
        all_side.add((double) 4.5);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side4(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 1);
        all_side.add((double) 2);
        all_side.add((double) 4);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side13(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 1);
        all_side.add((double) 4);
        all_side.add((double) 2);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side14(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 4);
        all_side.add((double) 1);
        all_side.add((double) 2);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side5(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 3);
        all_side.add((double) 3);
        all_side.add((double) 3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side6(){
        all_side = new ArrayList<Double>();
        all_side.add((double) -3);
        all_side.add((double) 3);
        all_side.add((double) 3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side7(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 3);
        all_side.add((double) -3);
        all_side.add((double) 3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_side8(){
        all_side = new ArrayList<Double>();
        all_side.add((double) 3);
        all_side.add((double) 3);
        all_side.add((double) -3);
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        tri.getArea();
        System.out.print("\n");
    }

    @Test
    public void test_point(){
        Ax = 13; Ay = 10;
        Bx = 10; By = 23;
        Cx = 37; Cy = 15;

        all_side = new ArrayList<Double>();
        Point point_A = new Point(Ax, Ay);
        Point point_B = new Point(Bx, By);
        Point point_C = new Point(Cx, Cy);
        all_side.add(Math.sqrt( Math.pow(point_A.getX() - point_B.getX(), 2) + Math.pow(point_A.getY() - point_B.getY(), 2) ));
        all_side.add(Math.sqrt( Math.pow(point_A.getX() - point_C.getX(), 2) + Math.pow(point_A.getY() - point_C.getY(), 2) ));
        all_side.add(Math.sqrt( Math.pow(point_B.getX() - point_C.getX(), 2) + Math.pow(point_B.getY() - point_C.getY(), 2) ));
        Triangle tri = new Triangle(all_side.get(0), all_side.get(1), all_side.get(2));
        tri.getType();
        System.out.print("\n");
    }
}
