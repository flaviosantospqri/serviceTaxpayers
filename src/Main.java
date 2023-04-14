import entities.models.Pessoa;
import entities.models.PessoaFisica;
import entities.models.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Pessoa> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Individual or Company (i/c) ");
            char ch = sc.next().charAt(0);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            sc.nextLine();

            System.out.print("Enter Anual Income: ");
            double anualIncome = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Enter Health expenditures: ");
                double healthExpenses = sc.nextDouble();

                persons.add(new PessoaFisica(name, anualIncome, healthExpenses));
            }else{
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                persons.add(new PessoaJuridica(name, anualIncome, numberEmployees));
            }
        }
        double sum = 0.0;
        System.out.println("TAXES PAID" + "\n");
        for(Pessoa p: persons){
            sum += p.calculateTax();
            System.out.printf("%s $ %.2f%n", p.getName(), p.calculateTax());
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}