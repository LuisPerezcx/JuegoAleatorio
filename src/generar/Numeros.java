package generar;

public class Numeros {
    public int generarNumeros(){
        return (int)(Math. random()*1000+1);
    }
    public int generarNumerosPares(){
        int numero;
        while (true){
            numero = (int)(Math. random()*1000+1);
            if(numero % 2 ==0){
                return numero;
            }
        }
    }
    public int generarNumerosImpar(){
        int numero;
        while (true){
            numero = (int)(Math. random()*1000+1);
            if(numero % 2 != 0){
                return numero;
            }
        }
    }
}
