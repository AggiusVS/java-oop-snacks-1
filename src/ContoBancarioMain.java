public class ContoBancarioMain {
    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancario("IT123456789");
        c1.deposita(2000);
        c1.preleva(550);
        System.out.println(String.format("Saldo attuale: %.2f", c1.getSaldo()));

    }
}
