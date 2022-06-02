public class PokemonBuilder {
    private final Pokemon pokemon = new Pokemon();

    public PokemonBuilder withPokemonType(String pokemonType) {
        pokemon.setPokemonType(pokemonType);
        return this;
    }

    public PokemonBuilder withHP(int HP) {
        pokemon.setHP(HP);
        return this;
    }

    public PokemonBuilder withNormalAttack(int normalAttack) {
        pokemon.setNormalAttack(normalAttack);
        return this;
    }

    public PokemonBuilder withSpecialAttack(int specialAttack) {
        pokemon.setSpecialAttack(specialAttack);
        return this;
    }

    public PokemonBuilder withDefense(int defense) {
        pokemon.setDefense(defense);
        return this;
    }

    public PokemonBuilder withSpecialDefense(int specialDefense) {
        pokemon.setSpecialDefense(specialDefense);
        return this;
    }

    public PokemonBuilder withAbility1(Ability ability1) {
        pokemon.setAbility1(ability1);
        return this;
    }

    public PokemonBuilder withAbility2(Ability ability2) {
        pokemon.setAbility2(ability2);
        return this;
    }

    public Pokemon createPokemon() { return pokemon; }
}
