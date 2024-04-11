public class Rectangulo extends Figura {
    public Rectangulo(int b,int a){
        super (b,a);
    }
    public int area(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}
