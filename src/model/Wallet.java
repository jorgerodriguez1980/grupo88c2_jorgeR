package model;

public class Wallet {

    public static final int CAPACIDAD_MAXIMA = 1000000;

    private int saldo; 
    private boolean tieneLimite;
    private int meta;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
    }

    public String saveMoney(int valor){
        if (valor < 0){
            return "Debe digitar una cantidad válida";
        }
        if (tieneLimite && valor + saldo > CAPACIDAD_MAXIMA){
            return "El saldo no puede superar la capacidad máxima";
        }
        saldo += valor;
        return "Transaccion exitosa!";
    }

    public String takeMoney(int valor){
        if(saldo < valor){
            return "El monto supera el saldo";
        } 
        saldo -= valor; // saldo = saldo - valor
        return "Transaccion exitosa";
    }

    public int getSaldo(){
        return saldo;
    }
    
    
}
