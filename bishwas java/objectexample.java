class Box{
    double  width, height, depth,vol;//data members
    void getvolume(){//member method
        width=10;
        height=20;  
        depth=15;
        vol=width*height*depth;

    }
    void display(){//member method
        System.out.println("volume of box="+vol);
    }

}
class objectexample{
    public static void main(String[] args) {
        Box box1=new Box();//creating instance of class Box
        box1.getvolume();//calling method using the object
        box1.display();//calling method using the object
    }
}

    

    
