public class Triangulo extends Figura {
    public Triangulo(int b, int a){
        super (b,a);
    }
        public int area(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}
