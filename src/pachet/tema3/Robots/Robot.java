package pachet.tema3.Robots;

/**
 * Created by slv on 11/2/2014.
 */
public abstract class Robot {
    /**
     * The Name of the robot
     */
    String mName;

    /**
     * The default constructor
     *
     * @param mName
     */
    public Robot(String mName) {
        this.mName = mName;
    }

    /**
     * This method sets what type of weapon the robot has
     * It has to be overwritten by subclasses
     *
     * @param WeaponName
     */
    public abstract void weapon(String WeaponName);

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
