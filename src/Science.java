public class Science {
    private String difficulty;
    private int professors;
    private boolean fun;

    public Science(String difficulty,int professors,boolean fun){
        this.difficulty = difficulty;
        this.professors = professors;
        this.fun = fun;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getProfessors() {
        return professors;
    }

    public boolean isFun() {
        return fun;
    }

    public void study() {
        System.out.println("You studied");
    }
}
