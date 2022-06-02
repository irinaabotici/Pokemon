public class Pokemon {
    private String pokemonType;
    private int HP;
    private int normalAttack;
    private int specialAttack;
    private int defense;
    private int specialDefense;
    private Ability ability1;
    private Ability ability2;

    public enum ItemType {
        Scut,
        Vestă,
        Săbiuță,
        BaghetăMagică,
        Vitamine,
        BraddeCrăciun,
        Pelerină
    }

    public void addItems(ItemType type) {
        switch (type) {
            case Scut -> {
                defense += 2;
                specialDefense += 2;
            }
            case Vestă -> HP += 10;
            case Săbiuță -> normalAttack += 3;
            case BaghetăMagică -> specialAttack += 3;
            case Vitamine -> {
                HP += 2;
                normalAttack += 2;
                specialAttack += 2;
            }
            case BraddeCrăciun -> defense += 1;
            case Pelerină -> specialDefense += 3;
        }
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public int getNormalAttack() {
        return normalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        this.normalAttack = normalAttack;
    }

    public Ability getAbility1() {
        return ability1;
    }

    public void setAbility1(Ability ability1) {
        this.ability1 = ability1;
    }

    public Ability getAbility2() {
        return ability2;
    }

    public void setAbility2(Ability ability2) {
        this.ability2 = ability2;
    }
}