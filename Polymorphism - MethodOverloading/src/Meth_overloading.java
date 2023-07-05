public class Meth_overloading {

    public void meth(){
        System.out.println("method1");
    }

    public void meth(int x){
        System.out.println("Method2");
    }

    public void meth(int x , int y){
        System.out.println("Method3");
    }

    public void meth(double a){
        System.out.println("Method4");
    }

    public static void main(String [] args){

        Meth_overloading obj = new Meth_overloading();
        obj.meth();
        obj.meth(10);
        obj.meth(10 , 5);
        obj.meth(0.5);
    }
}
