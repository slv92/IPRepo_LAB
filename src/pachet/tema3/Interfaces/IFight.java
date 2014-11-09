package pachet.tema3.Interfaces;

import pachet.tema3.Exceptions.FightException;
import pachet.tema3.Exceptions.FlyException;

/**
 * Created by slv on 11/2/2014.
 * This is the Interface for the robots that are going to fight
 */
public interface IFight {

    /**
     * This is the fighting method
     */
    public void fight() throws FightException;

    public void fly() throws FlyException;
}
