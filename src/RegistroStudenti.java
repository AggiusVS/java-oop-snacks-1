public class RegistroStudenti {
    private Studente[] studenti;
    private int conta;

    //costruttore
    public RegistroStudenti(){
        studenti = new Studente[256];
        conta = 0;
    }

    //metodi
    public void aggiungiStudente(Studente s){

        if(conta < studenti.length){
            studenti[conta] = s;
            conta++;
        }else { System.out.println("Registro pieno: impossibile aggiungere nuovi studenti");}
    }
    
    public void stampaStudenti(){
        if (conta == 0){
            System.out.println("Il registro è vuoto");
        } else { for (int i = 0; i < conta; i++) {
            System.out.println(studenti[i].scheda());
        }}
    }
}
