public class TurnOnAC implements Command {

    AC airConditioner;

    public TurnOnAC() {
    this.airConditioner = new AC();
    }

    public void execute() {
        airConditioner.turn_on();

    }
}
