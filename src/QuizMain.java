import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DomandaQuiz domanda = new DomandaQuiz("Qual è la capitale d'Italia?", "Roma");
        
        System.out.println(domanda.getDomanda());
        System.out.print("Risposta: ");
        String rispostaUtente = scanner.nextLine();

        domanda.stampaRisultato(rispostaUtente);
    }
}
