// Constructor with arguments
class Box {
    double l, b, h, vol;

    Box(double x, double y, double z) {
        l = x;
        b = y;
        h = z; 

    }

    void calculate() {
        vol = l * b * h;
        System.out.println("Volume is: " + vol);
    }
}

public class constructorB {
    public static void main(String[] args) {
        Box obj = new Box(10, 5, 3.3);
        obj.calculate();
    }

}