public class ArenaBuilder {
    private final Arena arena = ArenaSingleton.getInstance();

    public ArenaBuilder withAntrenor1(Trainer antrenor1) {
        arena.setAntrenor1(antrenor1);
        return this;
    }

    public ArenaBuilder withAntrenor2(Trainer antrenor2) {
        arena.setAntrenor2(antrenor2);
        return this;
    }

    public Arena createArena() { return arena;}
}
