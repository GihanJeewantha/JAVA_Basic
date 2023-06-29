public class Bank {

    int rupee;
    Bank(){
        rupee =0;
        System.out.println(rupee);
    }

    Bank(int x){
        rupee = x;
        System.out.println(rupee);
    }



        public static void main (String[] args){

        Bank Bn = new Bank();

        Bank Bn2 = new Bank( 20);



        }
}
