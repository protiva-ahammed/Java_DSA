package inheritance;

public class Box {

        double l;
        double h;
       private double w;// this private can be only used in this one class /page

Box(){
    this.h = -1;
    this.l = -1;
    this.w = -1;
//    this.weight = -5; base class can not access it's child class
}
//cube

    Box(double side){
    this.w = side;
    this.l = side;
        System.out.println(w*l);

    }
    Box(double w,double l,double h){
    this.l=l;
    this.w=w;
    this.h=h;
        System.out.println(l*w*h);
    }

    //copy constructor

    Box( Box old)
    {
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
public void information()
{
    System.out.println("Running the box..");
}


}
