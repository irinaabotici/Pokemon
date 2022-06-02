public class TrainerBuilder {
    private final Trainer trainer = new Trainer();

    public TrainerBuilder withName(String name) {
        trainer.setName(name);
        return this;
    }

    public TrainerBuilder withAge(int age) {
        trainer.setAge(age);
        return this;
    }

    public Trainer createTrainer() { return trainer; }
}
