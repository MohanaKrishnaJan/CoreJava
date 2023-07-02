package Day0405;

public class Smoothie extends Milk{
    int calories;

    Smoothie(double fatPercentage, int calories){
        this.fatPercentage = fatPercentage;
        this.calories = calories;
    }

    Smoothie(double fatPercentage){
        this.fatPercentage = fatPercentage;
        this.calories = 400;
    }
}
