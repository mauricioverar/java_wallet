import java.util.ArrayList;
import java.util.List;

public class AlfiWallet implements Wallet {

  // atributos
  private double saldo;
  private int USD = 900;

  private List<String> transacciones = new ArrayList<>();


  @Override
  public double obtenerSaldo() {
    return saldo;
    //0;
  }

  @Override
  public boolean depositar(double cantidad) { // OK
    saldo = saldo + cantidad; // 5000
    System.out.println("sumando......"+saldo);
    if ( cantidad > 0) {
      return true;
    }
    return false;
  }


  @Override
  public boolean retirar(double cantidad) {
    System.out.println("cantidad en AlfiWallet " + cantidad);
    if (cantidad > 0 ) { //&& saldo >= cantidad
      //saldo -= cantidad;
      System.out.println("Saldo..."+obtenerSaldo());


      System.out.println("restando......" + saldo);
      return true;
    } else {
      System.out.println("Ingrese un número mayor a 0 y menor o igual al saldo actual"+saldo);
      return false;
    }
  }

  @Override
  public boolean convertirMoneda(double cantidad, String desdeMoneda, String aMoneda) {

    saldo = saldo * USD;
    return false;
  }

}
