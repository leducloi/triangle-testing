import java.util.*;
import java.math.*;

public class Triangle {

    double side_a, side_b, side_c, area;
    boolean valid_tri;
    List<String> tri_type;

    Triangle(double side_1, double side_2, double side_3){
        this.side_a = side_1;
        this.side_b = side_2;
        this.side_c = side_3;
        this.tri_type = new ArrayList<String>();
        this.valid_tri = valid_triangle();
    }

    public boolean valid_triangle(){
        if (side_a <= 0 || side_b <= 0 || side_c <= 0){
            return false;
        }

        if ( ((side_a + side_b) <= side_c) || ((side_a + side_c) <= side_b) || ((side_b + side_c) <= side_a) ){
            return false;
        }
        return true;
    }

    public void equal_iso (){
        final double THRESHOLD = .01;
        if ( (Math.abs(side_a - side_b) < THRESHOLD) && (Math.abs(side_a - side_c) < THRESHOLD) ){
            tri_type.add("Equilateral");
        }
        else if ( (Math.abs(side_a - side_b) < THRESHOLD) || (Math.abs(side_a - side_c) < THRESHOLD) || (Math.abs(side_b-side_c) < THRESHOLD) ){
            tri_type.add("Isosceles");
        }
        else{
            tri_type.add("Scalene");
        }
    }

    public void right(){
        final double THRESHOLD = .01;
        double angle_a, angle_b, angle_c;
        double side_as, side_bs, side_cs;
        side_as = Math.pow(side_a, 2);
        side_bs = Math.pow(side_b, 2);
        side_cs = Math.pow(side_c, 2);
        angle_a = side_bs + side_cs;
        angle_b = side_as + side_cs;
        angle_c = side_as + side_bs;

        if ( (Math.abs(angle_a - side_as) < THRESHOLD) || (Math.abs(angle_b - side_bs) < THRESHOLD) || (Math.abs(angle_c - side_cs) < THRESHOLD) ){
            tri_type.add("Right");
        }
    }

    public void getType(){
        if (valid_tri == false){
            System.out.println("Invalid Triangle");
        } 
        else{
            equal_iso();
            right();
            int n = tri_type.size();
            System.out.printf("Triangle's Types: ");
            for (int i = 0; i < n ; i++){
                System.out.printf(tri_type.get(i) + " | ");
            }
        }
    }

    public void getArea(){
        if (valid_tri == true){
            double sp, area_s;
            sp = (side_a + side_b + side_c);
            area_s = sp*(sp - side_a)*(sp - side_b)*(sp-side_c);
            this.area = Math.sqrt(area_s);
            System.out.println("\nThe Area is: " + area);
        }
    }

    
}