public class ContoBancario {
    private String numeroConto;
    private double saldo;

    //costruttore
    public ContoBancario (String numeroConto){
        this.numeroConto = numeroConto;
        this.saldo= 0.0;
    }
    //getter

    public String getNumeroConto() {
        return numeroConto;
    }
    public double getSaldo() {
        return saldo;
    }

    //metodi

    public void deposita(double importo){
        if(importo > 0){
            saldo += importo;
        }
    }

    public void preleva(double importo){
        if (importo > 0 && importo <= saldo){
            saldo -= importo;
        }
    }
}

    
