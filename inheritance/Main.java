package inheritance;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        //in this public class I will call other classes,base,child

//        Box box= new Box( 4.6, 7.9,6);
//
//        System.out.println(box.l+" "+box.w+" "+box.h);

        BoxWeight box3 = new BoxWeight();

        System.out.println(box3.h+ " " +box3.weight);

//        BoxWeight box4 = new BoxWeight(2.6,3.3,4.4,5.5);
//        System.out.println(box4.h+" "+box4.);

        Box box5 = new BoxWeight(2,3,4,5);//[in stack there will be box5 in heap it will be Box type of

//        System.out.println(box5.weight);//here box5 's type is Box .But it was created from BoxWeight.
//        //it holds the template for Box==in parent meeting child is referencing parents;type of the referencing variable
//        System.out.println(box5.w);//private but creating an object of BoxWeight where w is not accessible

//        BoxWeight box6 = new Box(1,2,3);// not acceptable
    }
}
