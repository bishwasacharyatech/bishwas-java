class box {
    double width, height, depth, vol; // data members

    void getvolume() {// member method
        width = 10;
        height = 20;
        depth = 11.5;
    }

    double calculate() { // method to calculate volume

        vol = width * height * depth;
        return vol;

    }

}

class volume {
    public static void main(String[] args) {
        box obj = new box();// creating instance of class Box
        obj.getvolume();// calling method using the object
        double res = obj.calculate(); // calculate volume
        System.out.println("Volume of box=" + res);
    }
}