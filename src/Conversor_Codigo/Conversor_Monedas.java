/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversor_Codigo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Conversor_Monedas {
    private double dolar;
    private double Euros;
    private double Libras_Esterlinas;
    private double Yen_Japones;
    private double won_sul_Coreano;
    
    private static  double resultado;
    
    public Conversor_Monedas(){
        
            this.dolar= 6.91; 
            this.Euros = 7.39;
            this.Libras_Esterlinas = 8.32;
            this.Yen_Japones = 0.051;
            this.won_sul_Coreano = 0.0053; 
    }
    
    
    public double ConversionMonedas(double moneda , double extrangera){
        double conversion =  (moneda / extrangera);
        conversion =  (Math.rint(conversion * 1000)/1000);
        return conversion;
    }
    
    public double Conversion_Contraria(double moneda , double extrangera){
        double conversion = (Math.rint(moneda * extrangera)*10000/10000);
        return conversion; 
    }
    
    public void setalgoritmo(int option, double moneda){
        
        switch (option) {
            case 0:
                resultado = ConversionMonedas(moneda , this.dolar);
                break;
            case 1:
                resultado = ConversionMonedas(moneda , this.Euros);
                break;
            case 2:
                resultado = ConversionMonedas(moneda ,this.Libras_Esterlinas);
                break;
                
             case 3:
                resultado = ConversionMonedas(moneda ,this.Yen_Japones);
                break;
                
            case 4:
                resultado = ConversionMonedas(moneda ,this.won_sul_Coreano);
                break;
            case 5:
                resultado = Conversion_Contraria(moneda , this.dolar);
                break;
            case 6:
                resultado = Conversion_Contraria(moneda , this.Euros);
                break;
                
            case 7:
               resultado = Conversion_Contraria(moneda ,this.Libras_Esterlinas);
                break;
                
            case 8:
                resultado = Conversion_Contraria(moneda , this.Yen_Japones);
                break;
            case 9:
                resultado = Conversion_Contraria(moneda , this.won_sul_Coreano);
                break;    
            default:
               
                break;
        }
    }
    
    public double getalgoritmo (){
        return resultado;
       
    }
    
    
   
      
        
    

}
