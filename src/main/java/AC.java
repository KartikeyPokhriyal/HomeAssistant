public class AC extends Device {

    AC() {
        super();
    }

    public boolean turn_on() {
        is_On = true;
        return is_On;
    }

    public boolean turn_off() {
        is_off = true;
        return is_off;
    }
}