public class RegistroStudentiMain {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        Studente s1 = new Studente("Luca", "Bianchi", 24);
        Studente s2 = new Studente("Marco", "Rossi", 23);

        registro.aggiungiStudente(s1);
        registro.aggiungiStudente(s2);

        registro.stampaStudenti();
    }
}
