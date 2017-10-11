/*
Clase Descuento
Para el calculo del descuento, se utilizo la formula de la recta y = mX + b
En este caso se adecua al contexto la formula quedaria de la siguienta manera
        descuento = (0.004*cantHuevos) - 0.04
tomando en consideracion que no el descuento maximo es de 20% aunque sean 
60 o mas huevos
 */
package Clases;

/**
 *
 * @author esau_br
 */
public class Descuento {
    
    private int cantH;
    private double descuento;
    
    public Descuento()
    {
        cantH = 0 ;
        descuento =  0.00 ;
    }
    
    public Descuento(int cantH, double descuento)
    {
        this.cantH = cantH;
        this.descuento = descuento;
    }
    
    public void setCantH(int cantH)
    {
        this.cantH = cantH;
        
    }
    
    public int getCantH()
    {
        return cantH;
        
    }
    
    public void setDescuento(double descuento)
    {
        /*** ----Este Metodo Valida el siguiente Enunciado------
               El proveedor le dará un máximo de 20% de 
               descuento sobre el total de la compra si la
                empresa le da una suma mayor o igual a 60 huevos.*/
        
        int cant = getCantH();
        double formula = ((0.004*cant)-0.04);
        
        descuento =(cant<60)? formula : 0.20; 
        
        this.descuento = descuento;
    }
    
    public double getDescuento()
    {
        return descuento;
    }

    @Override
    public String toString() {
        return "Descuento{" + "cantH=" + cantH + ", descuento=" + descuento + '}';
    }
    
    
    
    
    
}
