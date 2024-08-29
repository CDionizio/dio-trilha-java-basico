import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        } else {
            valorImposto = 0.15f * valorSalario;
        }

        // TO DO Criar as demais condições para aliquotas de 10% e 15%
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%f", saida));

        leitorDeEntradas.close();
    }
  
}
