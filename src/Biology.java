public class Biology extends Science {
    private boolean plant;
    private boolean sick;

    public Biology(String difficulty, int professors, boolean fun, boolean plant, boolean sick){
        super(difficulty,professors,fun);
        this.plant = plant;
        this.sick = sick;
    }

    public boolean isPlant() {
        return plant;
    }

    public boolean isSick() {
        return sick;
    }

    public void useMicroscope(){
        System.out.println("You can see microbes");
    }
}
