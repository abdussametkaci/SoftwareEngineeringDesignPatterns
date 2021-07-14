package Lesson13.Example1Facede;

public class CarFacade {

    void move() {
        FuelSubsystem f = new FuelSubsystem();
        BrakeSubsystem b = new BrakeSubsystem();
        HandBreakSubsystem h = new HandBreakSubsystem();
        if (h.getHandBrakSituation()) {
            f.fuelControl();
            b.brakeControl();
        }
    }
}
