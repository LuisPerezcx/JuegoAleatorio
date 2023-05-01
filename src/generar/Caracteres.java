package generar;

import java.util.Random;

public class Caracteres {
    public char generarCaracteres(){
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }
}
