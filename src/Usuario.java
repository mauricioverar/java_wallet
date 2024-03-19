public class Usuario {
    private int id;
    private String nombre;
    private AlfiWallet wallet;

    public Usuario() {
    }

    public Usuario(int id, String nombre, AlfiWallet wallet) {
        this.id = id;
        this.nombre = nombre;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AlfiWallet getWallet() {
        return wallet;
    }

    public void setWallet(AlfiWallet wallet) {
        this.wallet = wallet;
    }

    // get set
    
// como instanciar al usuario desde main ( ingresando nombre por teclado)
    // confirmar tema de interface
    // podemos implementar el menu en el Main
    // como almacenar el saldo para poder retirar
    // como separar usaurios

    
}
