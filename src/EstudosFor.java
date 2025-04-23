import java.util.Scanner;

public class EstudosFor {
    public static void main(String[] args) throws Exception {
        Scanner EscanerNumeros = new Scanner(System.in);
        
        System.out.println("Qual o seu nome? ");
        String nome = EscanerNumeros.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = EscanerNumeros.nextInt();

            // Remove os espaços antes de contar os caracteres
            int caracteresSemEspaco = nome.replace(" ", "").length();


        if (nome.length() < idade) {
            System.out.println("Seu nome possuí: " + nome.length() + " caracteres, então sua idade possuí mais caracteres :)");
        } else{
            System.out.println("Seu nome possuí: " + nome.length() + " caracteres, então sua idade possuí menos caracteres :(");
        }
        contarCaracteres(nome, idade);
    }

    static void contarCaracteres(String nome, int idade) {
        int total = nome.replace(" ", " ").length() + idade;
        System.out.println("Sabia que a soma de sua idade " + idade + " e seu nome " + nome + " equivale há = " + total + " caracteres.");
    }

}