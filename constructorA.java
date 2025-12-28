// Cosntructor with no parameter
class box {
    double l, b, h, vol; // data members

    box() { // constructor
        l = 10;
        b = 5;
        h = 3.3;
    }

    void calculate() { // method to calculate volume

        vol = l * b * h;
        System.out.println("Volume is: " + vol);

    }
}

public class constructorA {
    public static void main(String[] args) {
        box obj = new box(); // creating instance of class Box
        obj.calculate(); // calling method using the object
    }

}
