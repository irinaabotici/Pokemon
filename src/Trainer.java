import java.util.ArrayList;

public class Trainer {
    public enum PokemonType {
        Pikachu,
        Bulbasaur,
        Charmander,
        Squirtle,
        Snorlax,
        Vulpix,
        Eevee,
        Jigglypuff,
        Meowth,
        Psyduck
    }

    protected String name;
    protected int age;
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void createPokemon(PokemonType type) {
        switch (type) {
            case Pikachu -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(35)
                    .withNormalAttack(0)
                    .withSpecialAttack(4)
                    .withDefense(2)
                    .withSpecialDefense(3)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(6)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(4)
                            .withStun("Yes")
                            .withDodge("Yes")
                            .withCooldown(5)
                            .createAbility())
                    .createPokemon());

            case Bulbasaur -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(42)
                    .withNormalAttack(0)
                    .withSpecialAttack(5)
                    .withDefense(3)
                    .withSpecialDefense(1)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(6)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(5)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(3)
                            .createAbility())
                    .createPokemon());
            case Charmander -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(50)
                    .withNormalAttack(4)
                    .withSpecialAttack(0)
                    .withDefense(3)
                    .withSpecialDefense(2)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(4)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(7)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(6)
                            .createAbility())
                    .createPokemon());
            case Squirtle -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(60)
                    .withNormalAttack(0)
                    .withSpecialAttack(3)
                    .withDefense(5)
                    .withSpecialDefense(5)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(4)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(3)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(2)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(2)
                            .createAbility())
                    .createPokemon());
            case Snorlax -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(62)
                    .withNormalAttack(3)
                    .withSpecialAttack(0)
                    .withDefense(6)
                    .withSpecialDefense(4)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(4)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(5)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(0)
                            .withStun("No")
                            .withDodge("Yes")
                            .withCooldown(5)
                            .createAbility())
                    .createPokemon());
            case Vulpix -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(36)
                    .withNormalAttack(5)
                    .withSpecialAttack(0)
                    .withDefense(2)
                    .withSpecialDefense(4)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(8)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(6)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(2)
                            .withStun("No")
                            .withDodge("Yes")
                            .withCooldown(7)
                            .createAbility())
                    .createPokemon());
            case Eevee -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(39)
                    .withNormalAttack(0)
                    .withSpecialAttack(4)
                    .withDefense(3)
                    .withSpecialDefense(3)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(5)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(3)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(3)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(3)
                            .createAbility())
                    .createPokemon());
            case Jigglypuff -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(34)
                    .withNormalAttack(4)
                    .withSpecialAttack(0)
                    .withDefense(2)
                    .withSpecialDefense(3)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(4)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(3)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .createPokemon());
            case Meowth -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(41)
                    .withNormalAttack(3)
                    .withSpecialAttack(0)
                    .withDefense(4)
                    .withSpecialDefense(2)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(5)
                            .withStun("No")
                            .withDodge("Yes")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(1)
                            .withStun("No")
                            .withDodge("Yes")
                            .withCooldown(3)
                            .createAbility())
                    .createPokemon());
            case Psyduck -> setPokemons(new PokemonBuilder()
                    .withPokemonType(type.name())
                    .withHP(43)
                    .withNormalAttack(3)
                    .withSpecialAttack(0)
                    .withDefense(3)
                    .withSpecialDefense(3)
                    .withAbility1(new AbilityBuilder()
                            .withDamage(2)
                            .withStun("No")
                            .withDodge("No")
                            .withCooldown(4)
                            .createAbility())
                    .withAbility2(new AbilityBuilder()
                            .withDamage(2)
                            .withStun("Yes")
                            .withDodge("No")
                            .withCooldown(5)
                            .createAbility())
                    .createPokemon());
            default -> {
                throw new IllegalArgumentException("Nu merge!");
            }
        }
    }

}
