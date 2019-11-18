
import javax.swing.JOptionPane;


public class Cuenta {
    
    private String num_Cuenta;
    private Cliente cliente;
    private double saldo;
    
    public Cuenta (){}

    public Cuenta(String num_Cuenta, Cliente cliente, double saldo) {
        this.num_Cuenta = num_Cuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(String num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void consignar(double valor)
    {
        this.saldo += valor;
    }
    
    public void retirar(double valor)
    {
    if (this.saldo >= valor)
    {
        this.saldo -= valor;
    }
    else
    {

        JOptionPane.showMessageDialog(null,"Fondos insuficientes");
    }
    }
    public String getInfo()
    {
        return this.num_Cuenta + " " +
                this.cliente.getDocumento() + " " +
                this.cliente.getNombre() + " " +
                this.cliente.getTelefono() + " " +
                this.getSaldo();
    }
    
}

