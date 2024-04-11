public class Ejemplo1 {
    public static void main(String[] args) {

        //Algo es static si no necesita una instancia
        //para acceder a el
        System.out.println(Contador.getCuentaClases());

        Contador c1 = new Contador();
        System.out.println(c1.getCuentaInstancias());

        //Todas las instancias de una clase comparten la
        //referencia al atributo static

        Contador c2 = new Contador();
        System.out.println(c2.getCuentaInstancias());

        System.out.println(c1.getCuentaClases());
        System.out.println(c2.getCuentaClases());

        Contador c3 = new Contador("Beto");
        Contador c4 = new Contador("Lola");

        System.out.println(c3.getNombre());
        System.out.println(c3.getCuentaClases());
        System.out.println(c4.getNombre());
        System.out.println(c4.getCuentaClases());



    }
}
