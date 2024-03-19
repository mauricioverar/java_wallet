public interface Wallet {
  double obtenerSaldo();
  boolean depositar(double cantidad);
  boolean retirar(double cantidad);
  boolean convertirMoneda(double cantidad, String desdeMoneda, String aMoneda);
}
