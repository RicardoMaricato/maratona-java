package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println(age);
        System.out.println(caractere);
        System.out.println(numeroGrande);
    }
}
