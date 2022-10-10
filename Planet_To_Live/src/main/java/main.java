enum Planet{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    NEPTUNE(7),
    URANUS(8);

    int number;

    Planet(int number) {
        this.number = number;
    }
}

public class main {
    public static void main(String[] args){

        //Here object Creation and calling in the way down below
        Planet myPlanet = Planet.URANUS;

        can_I_live_here(myPlanet);
    }

    static void can_I_live_here(Planet myPlanet){

        switch (myPlanet){
            case EARTH:
                System.out.println("YES, You can live here:)");
                System.out.println("This is planet #" +myPlanet.number);
                break;

            case MARS:
                System.out.println("Maybe after two decades");
                System.out.println("This is planet #" +myPlanet.number);
                break;

            default:
                System.out.println("OOPS!! no, you can't");
                System.out.println("This is planet #" +myPlanet.number);
                break;
        }
    }
}
