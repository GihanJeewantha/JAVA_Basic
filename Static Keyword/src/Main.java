public class Main {


    int x;
    static int y;

    void method1(){

    }

    static void method2(){

    }



    public static void main(String[]args){

        x = 4; //error because it not static it cannot derect access

        y = 5; //there is no error because it static it can direct access

    }
}
