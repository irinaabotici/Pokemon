import java.util.logging.Logger;

public class AbilityDecorator extends Ability {
    protected Ability ob;
    Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public AbilityDecorator(Ability ob) {
        this.ob = ob;
    }

    public void afiseaza() {
        ob.afiseaza();
    }
}
