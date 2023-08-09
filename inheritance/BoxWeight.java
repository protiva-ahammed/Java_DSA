package inheritance;

public class BoxWeight extends Box {

    double weight;

    public BoxWeight(){
        this.weight = -8;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }


    public BoxWeight(double w, double l, double h, double weight) {
        //super class
        super(w, l, h);//?? = call the parent class constructor
        //used to initialise values present in parent class
        this.weight = weight;
//        this.w = w;//can not be done error
    }
//but if a base class has a private var,meth that can not be accessed by child;
//in super class all can be accessed but not the protected type

//super() uses

//    use1; for multilavel inharitance
//    use2; super class is for only without any parameter will call the constructor of the object[every class has object as a super class]

}
