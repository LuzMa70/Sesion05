public class Equipo {
    public String nombre;
    public String ciudad;
    public int puntos;
    public Equipo(String n){
        nombre = n;
    }
    public Equipo(String n, String c, int p){
        nombre = n;
        ciudad = c;
        puntos = p;
    }
    public Equipo(String n, int p){
        nombre = n;
        puntos = p;
    }
    public Equipo(int p){
        puntos = p;
    }
    public void actualiza(String n){
        nombre = n;
    }
    public void actualiza(String n, String c){
        nombre = n;
        ciudad = c;
    }
    public void actualiza(int p){
        puntos = p;
    }
}
