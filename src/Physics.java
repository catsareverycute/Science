public class Physics extends Science{
    private int speedOfLight = 299792458;
    private double universalGravitationalConstant = 6.67430 * Math.pow(10,-11);

    public Physics(String difficulty, int professors, boolean fun){
        super(difficulty,professors,fun);
    }

    public int getSpeedOfLight() {
        return speedOfLight;
    }

    public double getUniversalGravitationalConstant() {
        return universalGravitationalConstant;
    }

    public void dropBall(){
        System.out.println("The ball has been dropped");
    }

}
