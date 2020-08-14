/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg1;

/**
 *
 * @author FAMILIA
 */
public class coche {
    private String Marca;
    private int Año;
    private String Color;
    private int Puertas;
            
    public coche(String pMarca, int pAño,String pColor){
        
        Marca = pMarca;
        Año = pAño;
        Color = pColor;
                
     }
public coche(String pMarca, int pAño,String pColor, int pPuertas){
        
        Marca = pMarca;
        Año = pAño;
        Color = pColor;
        Puertas = pPuertas;        
     }

    @Override
    public String toString() {
        return "coche{" + "Marca=" + Marca + ", A\u00f1o=" + Año + ", Color=" + Color + ", Puertas=" + Puertas + '}';
    }

   
    
    
}
