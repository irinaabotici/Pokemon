import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MultithreadingPokemons extends Thread {
    Pokemon pokemon1;
    Pokemon pokemon2;
    String comand1;
    String comand2;

    public boolean isStun2() {
        return stun2;
    }

    public void setStun2(boolean stun2) {
        this.stun2 = stun2;
    }

    boolean stun2;

    public boolean isStun1() {
        return stun1;
    }

    public void setStun1(boolean stun1) {
        this.stun1 = stun1;
    }

    boolean stun1;

    public MultithreadingPokemons(Pokemon pokemon1, String comand1,
                                  Pokemon pokemon2, String comand2) throws InterruptedException {
        this.pokemon1 = pokemon1;
        this.comand1 = comand1;
        this.pokemon2 = pokemon2;
        this.comand2 = comand2;
    }

    @Override
    public void run() {
        if (pokemon2.getHP() > 0 && pokemon1.getHP() > 0) {
            if (comand1.equals("specialAttack") && comand2.equals("normalAttack")
                    || comand1.equals("specialAttack") && comand2.equals("specialAttack")) {
                pokemon2.setHP(pokemon2.getHP() - (pokemon2.getSpecialDefense() - pokemon1.getSpecialAttack()));
                if (pokemon2.getHP() < 0) pokemon2.setHP(0);
            } else if (comand1.equals("normalAttack") && comand2.equals("specialAttack")
                    || comand1.equals("normalAttack") && comand2.equals("normalAttack")) {
                pokemon2.setHP(pokemon2.getHP() - (pokemon2.getDefense() - pokemon1.getNormalAttack()));
                if (pokemon2.getHP() < 0) pokemon2.setHP(0);

                //System.out.println(pokemon2.getPokemonType() + " HP " + pokemon2.getHP());
            } else if (comand1.equals("normalAttack") && comand2.equals("ability1")) {
                if (pokemon2.getAbility1() != null) {
                    if (pokemon2.getAbility1().getDodge().equals("No")) {
                        pokemon2.setHP(pokemon2.getHP() - (pokemon2.getDefense() - pokemon1.getNormalAttack()));
                    }
                }
            } else if (comand1.equals("normalAttack") && comand2.equals("ability2")) {
                if (pokemon2.getAbility2() != null) {
                    if (pokemon2.getAbility2().getDodge().equals("No")) {
                        pokemon2.setHP(pokemon2.getHP() - (pokemon2.getDefense() - pokemon1.getNormalAttack()));
                    }
                }
            }
        } else if (comand1.equals("specialAttack") && comand2.equals("ability1")) {
            if (pokemon2.getAbility1() != null) {
                if (pokemon2.getAbility1().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - (pokemon2.getSpecialDefense() - pokemon1.getSpecialAttack()));
                }
            }
        } else if (comand1.equals("specialAttack") && comand2.equals("ability2")) {
            if (pokemon2.getAbility2() != null) {
                if (pokemon2.getAbility2().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - (pokemon2.getSpecialDefense() - pokemon1.getSpecialAttack()));
                }
            }
        } else if (comand1.equals("ability1") && comand2.equals("normalAttack")
                || comand1.equals("ability1") && comand2.equals("specialAttack")) {
            if (pokemon1.getAbility1() != null) {
                pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility1().getDamage());
                Ability abilityDed = new AbilityDecorator(pokemon1.getAbility1());
                abilityDed.afiseaza();
            }
        } else if (comand1.equals("ability2") && comand2.equals("normalAttack")
                || comand1.equals("ability2") && comand2.equals("specialAttack")) {
            if (pokemon1.getAbility2() != null) {
                pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility2().getDamage());
                Ability abilityDed = new AbilityDecorator(pokemon1.getAbility2());
                abilityDed.afiseaza();
            }
        } else if (comand1.equals("ability1") && comand2.equals("ability1")) {
            if (pokemon1.getAbility1() != null && pokemon2.getAbility1() != null) {
                if (pokemon2.getAbility1().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility1().getDamage());
                }
            }
        } else if (comand1.equals("ability1") && comand2.equals("ability2")) {
            if (pokemon1.getAbility1() != null && pokemon2.getAbility2() != null) {
                if (pokemon2.getAbility2().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility1().getDamage());
                }
            }
        } else if (comand1.equals("ability2") && comand2.equals("ability2")) {
            if (pokemon1.getAbility2() != null && pokemon2.getAbility2() != null) {
                if (pokemon2.getAbility2().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility2().getDamage());
                }
            }
        } else if (comand1.equals("ability2") && comand2.equals("ability1")) {
            if (pokemon1.getAbility2() != null && pokemon2.getAbility1() != null) {
                if (pokemon2.getAbility1().getDodge().equals("No")) {
                    pokemon2.setHP(pokemon2.getHP() - pokemon1.getAbility2().getDamage());
                    Ability abilityDed = new AbilityDecorator(pokemon1.getAbility2());
                    abilityDed.afiseaza();
                    Ability abilityDed2 = new AbilityDecorator(pokemon2.getAbility1());
                    abilityDed2.afiseaza();
                }
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

