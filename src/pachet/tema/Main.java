package pachet.tema;

/**
 * Created by slv on 11/1/2014.
 * <p/>
 * This is the Main class.
 */

public class Main {

    public static void main(String[] args) {
        /**
         * Defining an object
         */
        Animal ani1 = new Animal();
        ani1.setmName("dog");
        ani1.setmColour("white");


        /**
         * Just a print
         */
        System.out.println("This " + ani1.getmName() + " is " + ani1.getmColour());

    }
}
