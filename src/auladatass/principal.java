package auladatass;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class principal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        calcularIdade(dia, mes, ano);
    }

    public static void calcularIdade(int dia, int mes, int ano) {
        try {
            LocalDate nascimento = LocalDate.of(ano, mes, dia);
            LocalDate hoje = LocalDate.now();

            if (nascimento.isAfter(hoje)) {
                System.out.println("Data errada");
                return;
            }

            Period idade = Period.between(nascimento, hoje);

            int anos = idade.getYears();
            int meses = idade.getMonths();
            int dias = idade.getDays();
            

            System.out.println(" sua idade e de:");
            System.out.println(anos + " anos");
            System.out.println(meses + " meses");
            System.out.println(dias + " dias");

        } catch (Exception e) {
            System.out.println("Data invalida");
        }
    }
}