package pachet.tema3.Robots;

import pachet.tema3.Interfaces.IFight;

/**
 * Created by slv on 11/2/2014.
 */
public class Decepticon extends Robot implements IFight {

    /**
     * Constructor
     *
     * @param name
     */
    private String faction = "Decepticon";
    private String weapon;

    public Decepticon(String name) {
        super(name);
    }

    @Override
    public void fight() {
        if (getmName() == null) {
            System.out.println("The robot's name is invalid and so he won't fight.");
            return;
        }

        System.out.println(getmName() + " is fighting the war of Cybertron.");
    }

    @Override
    public void fly() {
        if (getmName() == null) {
            System.out.println("No robot is flying.");
            return;
        }

        System.out.println(getmName() + " is flying on Cybertron.");
    }

    @Override
    public void weapon(String weaponName) {
        weapon = weaponName;
    }
}
