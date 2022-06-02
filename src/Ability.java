import java.util.logging.Level;
import java.util.logging.Logger;

public class Ability {
    int damage;
    String stun;
    String dodge;
    int cooldown;
    Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void afiseaza() {
        log.log(Level.INFO, "Damage: " + damage + ", stun: "
                + stun + ", dodge: " + dodge + ", cooldown: " + cooldown);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getStun() {
        return stun;
    }

    public void setStun(String stun) {
        this.stun = stun;
    }

    public String getDodge() {
        return dodge;
    }

    public void setDodge(String dodge) {
        this.dodge = dodge;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
