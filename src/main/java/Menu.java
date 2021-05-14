import java.util.Scanner;

public class Menu {

        Generator generator = new Generator();
        Scanner scan = new Scanner(System.in);

    void display() {

        displayMessage();

        String answer = scan.nextLine();

        switch(answer) {
            case "1":
                displayMatriculas("old");
                tryAgain();
                break;
            case "2":
                displayMatriculas("new");
                tryAgain();
                break;
            case "3":
                System.out.println("Bye bye!");
                scan.nextLine();
                System.exit(0);
            default:
                System.out.println("Please try again");
        }
    }

    void displayMessage() {
        System.out.println("\n" + "========== GERADOR DE MATRICULAS ==========");
        System.out.println("\n" + "1 - Gerar matriculas antigas");
        System.out.println("2 - Gerar matriculas novas");
        System.out.println("3 - Fechar programa" + "\n");
        equalSeparator();
    }

    void displayMatriculas(String resposta) {
        equalSeparator();

        if (resposta.equals("old")) {
            System.out.println("LISTA DE MATRICULAS ANTIGAS" + "\n");
            for (int i = 0; i < 10; i++) {
                System.out.println("Matricula " + (i+1) + ": " + generator.generateOld());
            }
        } else {
            System.out.println("LISTA DE MATRICULAS NOVAS" + "\n");
            for (int i = 0; i < 10; i++) {
                System.out.println("Matricula " + (i+1) + ": " + generator.generateNew());
            }
        }
        equalSeparator();
    }

    void equalSeparator() {
        System.out.println("===========================================");
    }

    void tryAgain() {
        display();
    }
}
