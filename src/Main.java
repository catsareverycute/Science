//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Science science = new Science("Hard",1000000,true);
        System.out.println(science.getDifficulty());
        System.out.println(science.getProfessors());
        System.out.println(science.isFun());
        science.study();
        System.out.println();

        Physics physics = new Physics("Medium",150000,true);
        System.out.println(physics.getDifficulty());
        System.out.println(physics.getProfessors());
        System.out.println(physics.isFun());
        System.out.println(physics.getSpeedOfLight());
        System.out.println(physics.getUniversalGravitationalConstant());
        physics.dropBall();
        System.out.println();

        Biology biology = new Biology("Easy",600000,false,false,false);
        System.out.println(biology.getDifficulty());
        System.out.println(biology.getProfessors());
        System.out.println(biology.isFun());
        System.out.println(biology.isPlant());
        System.out.println(biology.isSick());
        biology.useMicroscope();
    }
}