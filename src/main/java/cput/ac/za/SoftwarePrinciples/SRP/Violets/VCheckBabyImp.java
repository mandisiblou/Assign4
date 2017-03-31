package cput.ac.za.SoftwarePrinciples.SRP.Violets;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class VCheckBabyImp implements VCheckBaby {

    public boolean isEating() {
            System.out.println("Baby is Eating");
        return true;
    }
    public boolean isRunning() {
        System.out.println("Baby is Running");
        return true;
    }
    public boolean isSleeping() {
        System.out.println("Baby is Sleeping");
        return true;
    }
}
