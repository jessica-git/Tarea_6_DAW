package clases;
/** método que devuelve el área del rectángulo */
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
    /** @return area */
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
    /** @return base */
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    /** @return altura */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
