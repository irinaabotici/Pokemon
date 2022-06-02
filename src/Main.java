import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        File file = new File("../tests");
        File[] files = file.listFiles();
        String trainerName, pokemon, item;
        ArrayList<Trainer> trainers = new ArrayList<>();
        Trainer trainer = null;
        int age;
        assert files != null;
        for (File f : files) {
            try {
                Random rand = new Random();
                Scanner myReader = new Scanner(f);
                while (myReader.hasNextLine()) {
                    trainerName = myReader.nextLine();
                    age = Integer.parseInt(myReader.nextLine());
                    trainer = new TrainerBuilder()
                            .withName(trainerName)
                            .withAge(age)
                            .createTrainer();
                    for (int i = 0; i < 3; i++) {
                        StringTokenizer tokenizer = new StringTokenizer(myReader.nextLine(), "- ,");
                        pokemon = tokenizer.nextToken();
                        trainer.createPokemon(Trainer.PokemonType.valueOf(pokemon));
                        while (tokenizer.hasMoreTokens()) {
                            item = tokenizer.nextToken();
                            for (Pokemon poke : trainer.getPokemons()) {
                                if (poke.getPokemonType().equals(pokemon)) {
                                    poke.addItems(Pokemon.ItemType.valueOf(item));
                                    break;
                                }
                            }
                        }
                    }
                    trainers.add(trainer);
                }
                Arena arena = new ArenaBuilder()
                        .withAntrenor1(trainers.get(0))
                        .withAntrenor2(trainers.get(1))
                        .createArena();
                int rand_number = rand.nextInt(3);
                if (rand_number == 0) {
                    arena.createEvent(Arena.EventType.Event1);
                } else if (rand_number == 1) {
                    arena.createEvent(Arena.EventType.Event2);
                } else {
                    arena.createEvent(Arena.EventType.Event3);
                }


            } catch (FileNotFoundException e) {
                log.log(Level.WARNING, "Error parse.");
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
