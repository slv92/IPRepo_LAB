package pachet.tema3;

import pachet.tema3.Interfaces.IFight;
import pachet.tema3.Robots.Autobot;
import pachet.tema3.Robots.Decepticon;
import pachet.tema3.Robots.Robot;

/**
 * Created by slv on 11/2/2014.
 * Main class of the project
 */
public class Main {

    public static void main(String[] args) {
/**
 * Main class
 */
        Robot optimus = new Autobot("OptimusPrime");
        Robot mega = new Decepticon("Megatron");
        Decepticon star = new Decepticon("StarScream");
        IFight bee = new Autobot("BumbleBee");

        try {
            bee.fight();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            ((IFight) optimus).fly();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}


