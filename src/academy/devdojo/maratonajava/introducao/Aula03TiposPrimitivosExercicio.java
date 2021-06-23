package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Ricardo Maricato";
        String address = "Rua Antônio Matta";
        double wage = 4000.0;
        String salaryReceiptDate = "06/05/2021";

        String report = "Eu " + name + ", morando no endereço " + address
                + ", confirmo que recebi o salário de " + wage + ", na data " + salaryReceiptDate;

        System.out.println(report);
    }
}
