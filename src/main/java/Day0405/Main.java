package Day0405;

public class Main {
    public static void main(String[] args) {

        System.out.println("***** First Sub *****\n");
        FlyingMachine f1 = new FlyingMachine();
        System.out.println("I have "+f1.fly(4)+" wings to fly");

        FlyingMachine f2 = new FlyingMachine();
        f2.sound("zzz");
        System.out.println("\n\n");

        System.out.println("***** Second Sub *****\n");
        Smoothie s1 = new Smoothie(2.5,650);
        Smoothie s2 = new Smoothie(8.1);
        System.out.println("Total Fat = " + s1.fatPercentage + " Total Calories = " + s1.calories);
        System.out.println("Total Fat = " + s2.fatPercentage + " Total Calories = " + s2.calories);
        System.out.println("\n\n");

        System.out.println("***** Third Sub *****\n\n");
        System.out.println("I am baby bear and I have " + Bear.legs + " legs yet");
        System.out.println("\n\n");

        System.out.println("***** Fourth Sub *****\n\n");
        Democracy d1 = new Democracy();
        d1.verdict();
        System.out.println("\n\n");
    }
}
