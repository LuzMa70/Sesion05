public class Contador {
    public static short cuentaClases;
    public short cuentaInstancias;
    public String nombre;

    public Contador() {
        cuentaInstancias++;
        cuentaClases++;

    }

    public Contador(String n){
        nombre = n;

    }
    public static short getCuentaClases() {
        return cuentaClases;
    }

    public short getCuentaInstancias() {
        return cuentaInstancias;
    }

    public String getNombre() {
        return nombre;
    }
}
