
com.company
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] nome = new String[5];
        double[] nota = new double[5];
        double soma = 0;
        double media;
        double maior;

        for(int i = 0; i < 5; ++i){
            System.out.println("Digite o nome n"+(i+1)+"º : ");
            nome[i] = input.nextLine();
            System.out.println("Digite a nota do nome n"+(i+1)+"º : ");
            nota[i] = input.nextDouble();
            soma = soma + nota[i];
        }

        media = soma/5;

        for(int i = 0; i < 5; ++i){
            if(nota[i] > media){
                maior = nota[i];
                System.out.println("O aluno "+nome[i]+" possui média "+maior+", maior que a média "+media);
            }
        }
    }
}