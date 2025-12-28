//using break to exit a loop.
public class breakloop {

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            if(i==10)break;//terminal loop if i is 10
            System.out.println("i: " +i);
        }
        System.out.println("Loop complete");
    }
}