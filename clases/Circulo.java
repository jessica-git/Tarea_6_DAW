package clases;

import clases.Figura;
/** método que devuelve el área del círculo */
public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;
    
    /** @return area */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
    /** @return radio */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
