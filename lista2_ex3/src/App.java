import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu sexo, se masculino informe M se feminino F: ");
        String sexo = ler.nextLine();
        System.out.println("");

        if("F".equalsIgnoreCase(sexo)){
            System.out.print("Feminino");
        }
        else if("M".equalsIgnoreCase(sexo)){
            System.out.print("Masculino");
        }
        else{
            System.out.print("Sexo invalido");
        }
    }
}