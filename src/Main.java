//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        Scanner entrada = new Scanner(System.in);
        //String nombre;
        String rut;
        int opcion, monto;

        // instanciar
        AlfiWallet saldo = new AlfiWallet();
        AlfiWallet deposito = new AlfiWallet();
        AlfiWallet retiro = new AlfiWallet();



        System.out.println("********************");
        System.out.println("Billetera Virtual");

        System.out.println("Ingrese nombre: ");
        String nombre = entrada.nextLine();
        Usuario usuario1 = new Usuario(); // nombre ??
        usuario1.getWallet().obtenerSaldo();

        
        System.out.println("Ingrese rut: ");
        rut = entrada.nextLine();

        // menu
        do {
        System.out.println("Ingrese una opcion");
            System.out.println(" 0: para salir");
            System.out.println(" 1: para consultar saldo");
            System.out.println(" 2: para depositar");
            System.out.println(" 3: para retirar");
            System.out.println(" 4: para convertir moneda (EUR/USD)");
            System.out.println(" 5: para obtener transacciones");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando Menu");
                    break;
                case 1:
                    //System.out.println("Su saldo es: ");
                    System.out.println( saldo.obtenerSaldo());
                    usuario1.getWallet().obtenerSaldo();
                    break;

                case 2:
                    System.out.println("Ingrese el monto a depositar");
                    monto = entrada.nextInt(); // 5000
                    if (deposito.depositar((monto))) {
                        System.out.println("Monto depositado: " + monto);
                        usuario1.getWallet().depositar(monto);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    monto = entrada.nextInt(); // 1000

                    System.out.println("Monto retirado es : " + retiro.retirar(monto));
                    usuario1.getWallet().retirar(monto);

//                    double nuevo_saldo = retiro.obtenerSaldo() - monto;
//                    System.out.println("Monto retirado: " + monto);
                    //System.out.println("Su nuevo saldo es: " + nuevo_saldo);

                    break;
                case 4:
                    System.out.println("A que moneda quiere convertir ");
//                    monto = entrada.nextInt(); // 5000
//                    if (deposito.depositar((monto))) {
//                        System.out.println("Monto depositado: " + monto);
//                        usuario1.getWallet().depositar(monto);
//                    }
                    break;

                case 5:
                    System.out.println("Imprimir cartola");
//                    monto = entrada.nextInt(); // 5000
//                    if (deposito.depositar((monto))) {
//                        System.out.println("Monto depositado: " + monto);
//                        usuario1.getWallet().depositar(monto);
//                    }
                    break;

                default:
                    System.out.println("Opcion no existe");
                    System.out.println();

            }
        } while (opcion != 0);

        entrada.close();
    }
}