import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        
        int qtd = 1;

        String login[] = new String[qtd];
        String senha[] = new String[qtd];

        login[0] = "admin";
        senha[0] = "admin";

        Scanner scan = new Scanner(System.in);

        Date data = new Date();
        int hora = Integer.parseInt(new SimpleDateFormat("HH").format(data));
        int minuto = Integer.parseInt(new SimpleDateFormat("mm").format(data));      

        System.out.println("Informe seu login: ");
        String loginUsuario = scan.nextLine();
        System.out.println("Informe sua senha:");
        String senhaUsuario = scan.nextLine();

        for (int i = 0; i<login.length; i++){

            if (loginUsuario.equals(login[i]) && senhaUsuario.equals(senha[i])){

                if (hora>= 6 && hora <=11){
                    if(minuto >=0 && minuto <=59){
                        System.out.println("Bom dia, você se logou ao nosso sistema.");
                    }
                } else if(hora >11 && hora <=17){
                    if(minuto >=0 && minuto <=59){
                        System.out.println("Boa tarde, você se logou ao nosso sistema.");
                    }
                } else if(hora >17 && hora <=23){
                    if(minuto >=0 && minuto <=59){
                        System.out.println("Boa noite, você se logou ao nosso sistema.");
                    }
                }else if(hora >=0  && hora <=5){
                    if(minuto >=0 && minuto <=59){
                        System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                    }
                }
            } else{
                System.out.println("Usuário e/ou senha incorretos.");
            }

        }





    }
}
