package POOA.GestaoDeContas;

/**
 *
 * @author dr. Fundo
 */
public class Conta {

	private int NumConta;
	private String Titular;
	private double saldo;

    public Conta(int NumConta, String Titular, double saldo) {
        this.NumConta = NumConta;
        this.Titular = Titular;
        this.saldo = saldo;
    }

        
        
        
    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	
	
	
}
