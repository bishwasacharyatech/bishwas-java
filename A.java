class B {
    int a,b,sum;
    public int add(){
        a=10;
        b=15;
        sum=a+b;
        return sum;
    }
}

class A{
    public static void main(String[] args) {
        B obj=new B();
        int res=obj.add();
        System.out.println("sum of two number="+res);
    }
}