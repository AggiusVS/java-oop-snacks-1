public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    //costruttore

    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    //getter
    public String getCognome() {
        return cognome;
    }public String getNome() {
        return nome;
    }
    public int getEta() {
        return eta;
    }

    //setter

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    //metodi

    public String scheda(){
        return (nome + " "  + cognome + ", " + eta + " anni");
    }
}
