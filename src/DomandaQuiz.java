public class DomandaQuiz {
    private String domanda;
    private String rispotaCorretta;

    public DomandaQuiz(String domanda, String rispostaCorretta){
        this.domanda = domanda;
        this.rispotaCorretta = rispostaCorretta;
    }

    public boolean verificaRisposta (String rispostaUtente){
        return rispotaCorretta.equalsIgnoreCase(rispostaUtente.trim());
    }

    public void stampaRisultato(String rispostaUtente){
        if(verificaRisposta(rispostaUtente)){
            System.out.println("Risposta corretta");
        } else {
            System.out.println("Risposta errata. La risposta corretta era " + rispotaCorretta);
        }
    }

    public String getDomanda(){
        return domanda;
    }
}
