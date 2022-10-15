import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws Exception {
        String perguntas[] = new String[3];
        char gabarito[] = new char[3];
    
        // String pergunta1 = "50+10 é: \n a)60 \n b)70\n c>80 ";
        perguntas[0]="Resolva o seguinte problema: 50+10 é: \n a)60 \n b)70\n c)80 ";
        gabarito[0]='a';

        perguntas[1]="A capital do brasil é: \n a)Rio de Janeiro \n b)Brasília\n c)São Paulo ";
        gabarito[1]='b';

        perguntas[2]="O Brasil está localizado na: \n a)Europa \n b)Asia\n c)América do Sul ";
        gabarito[2]='c';

        char respostaUsuario[] = new char[3]; 
        int acertos = 0;
        int erros = 0;

        System.out.println("Informe seu nome: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        
        for (int i = 0; i<perguntas.length; i++){

            System.out.println("Pergunta número " + (i+1) + ":");
            System.out.println(perguntas[i]);

            respostaUsuario[i] = '0';
            
            //para que repita a resposta se colocar algum numero
            while(Character.isDigit(respostaUsuario[i])){
                System.out.println("Sua resposta: ");
                respostaUsuario[i] = scan.next().charAt(0);
            }   

            if (respostaUsuario[i] == gabarito[i]) {
                acertos++;
            }else{
                erros++;
            }

        }

        

        System.out.println("Usuário " + nome + ":");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);



    }

}
