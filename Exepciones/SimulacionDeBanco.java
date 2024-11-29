package Exepciones;

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes para retirar " + cantidad + ". Saldo actual: " + saldo);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

public class SimulacionDeBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());

        cuenta.depositar(500);

        try {
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.retirar(800);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.obtenerSaldo());
    }
}
