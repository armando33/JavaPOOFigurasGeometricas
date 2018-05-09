/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author armando
 */
public class Pentagono {
    
    private double Lado;

    public Pentagono(double lado) {
        this.Lado = lado;
    }
    
    public Pentagono() {
        this.Lado = 0;
    }

    /**
     * @return the Lado
     */
    public double getLado() {
        return Lado;
    }

    /**
     * @param lado the Lado to set
     */
    public void setLado(double lado) {
        this.Lado = lado;
    }
    
    public double getPerimetro(){
    
        return (5*this.Lado);
    }
    
    public double getArea(){
    
        return ((5*this.Lado*(this.Lado/1.45))/2);
    }
    
}
