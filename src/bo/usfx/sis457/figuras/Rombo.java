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
public class Rombo {
    private double DiagonalMayor;
    private double DiagonalMenor;
    

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.DiagonalMayor = diagonalMayor;
        this.DiagonalMenor = diagonalMenor;
    }
    
    public Rombo() {
        this.DiagonalMayor =0;
        this.DiagonalMenor =0;
        
    }

    /**
     * @return the DiagonalMayor
     */
    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    
    public void setDiagonalMayor(double diagonalMayor) {
        this.DiagonalMayor = diagonalMayor;
    }

    /**
     * @return the DiagonalMenor
     */
    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    
    public void setDiagonalMenor(double diagonalMenor) {
        this.DiagonalMenor = diagonalMenor;
    }
    
    public double getArea(){
        return ((this.DiagonalMayor*this.DiagonalMenor)/2);
    }
    
    /**
     * @return Perimetro P = 4a  y a es el un lado del rombo y es igial a
     * a= a 2 = (d/2) 2 + (D/2) 2
     */
    public double getPerimetro(){
        return (4*(Math.sqrt(Math.pow((this.DiagonalMayor/2), 2)+
                Math.pow((this.DiagonalMenor/2),2))));
    }
    
    
}
