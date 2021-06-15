package generations;

import java.util.Random;

public class EmailCreate {

    private static String emailRandom;

    public static String emailCreate(){
        Integer numeroRandom = new Random().nextInt();
        emailRandom = "val"+numeroRandom+"@teste.com";

        return emailRandom;
    }
}
