public class AbilityBuilder {
    private final Ability ability = new Ability();

    public AbilityBuilder withDamage(int damage) {
        ability.setDamage(damage);
        return this;
    }

    public AbilityBuilder withStun(String stun) {
        ability.setStun(stun);
        return this;
    }

    public AbilityBuilder withDodge(String dodge) {
        ability.setDodge(dodge);
        return this;
    }

    public AbilityBuilder withCooldown(int cooldown) {
        ability.setCooldown(cooldown);
        return this;
    }

    public Ability createAbility() { return ability; }
}
