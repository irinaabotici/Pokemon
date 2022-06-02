import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arena extends Thread {
    private Trainer antrenor1;
    private Trainer antrenor2;

    public enum EventType {
        Event1,
        Event2,
        Event3
    }

    public void createEvent(EventType type) throws InterruptedException {
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        switch (type) {
            case Event1 -> {
                Random rand = new Random();
                Pokemon neutrel1 = new PokemonBuilder()
                        .withPokemonType("Neutrel1")
                        .withHP(10)
                        .withNormalAttack(3)
                        .withSpecialAttack(0)
                        .withDefense(1)
                        .withSpecialDefense(1)
                        .withAbility1(null)
                        .withAbility2(null)
                        .createPokemon();
                ArrayList<String> comands = new ArrayList<>();
                comands.add("normalAttack");
                comands.add("specialAttack");
                comands.add("ability1");
                comands.add("ability2");
                for (int i = 0; i < 3; i++) {
                    while (neutrel1.getHP() > 0) {
                        int comand1 = rand.nextInt(4);
                        int comand2 = rand.nextInt(4);
                        MultithreadingPokemons pokemon2 = new MultithreadingPokemons(neutrel1, comands.get(comand2),
                                antrenor1.getPokemons().get(i), comands.get(comand1));
                        MultithreadingPokemons pokemon1 = new MultithreadingPokemons(antrenor1.getPokemons().get(i),
                                comands.get(comand1), neutrel1, comands.get(comand2));
                        pokemon1.start();
                        pokemon2.start();
                    }

                    if (antrenor1.getPokemons().get(i).getHP() > neutrel1.getHP()) {
                        log.log(Level.WARNING, "Fight between " + antrenor1.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel1.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor1.getPokemons().get(i).getPokemonType());
                    } else {
                        log.log(Level.WARNING, "Fight between " + antrenor1.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel1.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor1.getPokemons().get(i).getPokemonType());
                    }
                }

                for (int i = 0; i < 3; i++) {
                    while (neutrel1.getHP() > 0) {
                        int comand1 = rand.nextInt(4);
                        int comand2 = rand.nextInt(4);
                        MultithreadingPokemons pokemon2 = new MultithreadingPokemons(neutrel1, comands.get(comand2),
                                antrenor2.getPokemons().get(i), comands.get(comand1));
                        MultithreadingPokemons pokemon1 = new MultithreadingPokemons(antrenor2.getPokemons().get(i),
                                comands.get(comand1), neutrel1, comands.get(comand2));
                        pokemon1.start();
                        pokemon2.start();
                    }

                    if (antrenor2.getPokemons().get(i).getHP() > neutrel1.getHP()) {
                        log.log(Level.WARNING, "Fight between " + antrenor2.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel1.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor2.getPokemons().get(i).getPokemonType());
                    } else {
                        log.log(Level.WARNING, "Fight between " + antrenor2.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel1.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor2.getPokemons().get(i).getPokemonType());
                    }
                }

            }
            case Event2 -> {
                Random rand = new Random();
                Pokemon winner;
                Pokemon neutrel2 = new PokemonBuilder()
                        .withPokemonType("Neutrel2")
                        .withHP(20)
                        .withNormalAttack(4)
                        .withSpecialAttack(0)
                        .withDefense(1)
                        .withSpecialDefense(1)
                        .withAbility1(null)
                        .withAbility2(null)
                        .createPokemon();
                ArrayList<String> comands = new ArrayList<>();
                comands.add("normalAttack");
                comands.add("specialAttack");
                comands.add("ability1");
                comands.add("ability2");
                for (int i = 0; i < 3; i++) {
                    while (neutrel2.getHP() > 0) {
                        int comand1 = rand.nextInt(4);
                        int comand2 = rand.nextInt(4);
                        MultithreadingPokemons pokemon2 = new MultithreadingPokemons(neutrel2, comands.get(comand2),
                                antrenor1.getPokemons().get(i), comands.get(comand1));
                        MultithreadingPokemons pokemon1 = new MultithreadingPokemons(antrenor1.getPokemons().get(i),
                                comands.get(comand1), neutrel2, comands.get(comand2));
                        pokemon1.start();
                        pokemon2.start();
                    }

                    if (antrenor1.getPokemons().get(i).getHP() > neutrel2.getHP()) {
                        log.log(Level.WARNING, "Fight between " + antrenor1.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel2.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor1.getPokemons().get(i).getPokemonType());
                        winner = antrenor1.getPokemons().get(i);
                    } else {
                        log.log(Level.WARNING, "Fight between " + antrenor1.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel2.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor1.getPokemons().get(i).getPokemonType());
                        winner = antrenor1.getPokemons().get(i);
                    }
                    winner.setHP(winner.getHP() + 1);
                    winner.setDefense(winner.getDefense() + 1);
                    winner.setSpecialDefense(winner.getSpecialDefense() + 1);
                    if (winner.getNormalAttack() == 0) {
                        winner.setSpecialAttack(winner.getSpecialAttack() + 1);
                    } else {
                        winner.setNormalAttack(winner.getNormalAttack() + 1);
                    }
                }

                for (int i = 0; i < 3; i++) {
                    while (neutrel2.getHP() > 0) {
                        int comand1 = rand.nextInt(4);
                        int comand2 = rand.nextInt(4);
                        MultithreadingPokemons pokemon2 = new MultithreadingPokemons(neutrel2, comands.get(comand2),
                                antrenor2.getPokemons().get(i), comands.get(comand1));
                        MultithreadingPokemons pokemon1 = new MultithreadingPokemons(antrenor2.getPokemons().get(i),
                                comands.get(comand1), neutrel2, comands.get(comand2));
                        pokemon1.start();
                        pokemon2.start();
                    }

                    if (antrenor2.getPokemons().get(i).getHP() > neutrel2.getHP()) {
                        log.log(Level.WARNING, "Fight between " + antrenor2.getPokemons().get(i).getPokemonType() + " and "
                                                    + neutrel2.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor2.getPokemons().get(i).getPokemonType());
                        winner = antrenor2.getPokemons().get(i);
                    } else {
                        log.log(Level.WARNING, "Fight between " + antrenor2.getPokemons().get(i).getPokemonType() + " and "
                                + neutrel2.getPokemonType());
                        log.log(Level.INFO, "Winner " + antrenor2.getPokemons().get(i).getPokemonType());
                        winner = antrenor2.getPokemons().get(i);
                    }
                    winner.setHP(winner.getHP() + 1);
                    winner.setDefense(winner.getDefense() + 1);
                    winner.setSpecialDefense(winner.getSpecialDefense() + 1);
                    if (winner.getNormalAttack() == 0) {
                        winner.setSpecialAttack(winner.getSpecialAttack() + 1);
                    } else {
                        winner.setNormalAttack(winner.getNormalAttack() + 1);
                    }
                }
            }
            case Event3 -> {

            }
        }
    }



    public Trainer getAntrenor1() {
        return antrenor1;
    }

    public void setAntrenor1(Trainer antrenor1) {
        this.antrenor1 = antrenor1;
    }

    public Trainer getAntrenor2() {
        return antrenor2;
    }

    public void setAntrenor2(Trainer antrenor2) {
        this.antrenor2 = antrenor2;
    }
}
