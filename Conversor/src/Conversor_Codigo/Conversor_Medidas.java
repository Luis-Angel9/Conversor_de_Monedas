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
public class Conversor_Medidas {
    private static double resultados;
   
    
    
 public Conversor_Medidas() {
    
 
 }
 
    public double metros_Centimetros(double num){
        double conver =  (num * 100)/1;                  //1 metro es igual a 100cm
        return conver;

    }
    public double kilometros_Metros(double num){            ///1km = a 1000metros
        double conver = (num * 1000)/1;
        return conver;
    }
    
    public double centimetros_Metros(double num){  
          double conver = (num * 1)/100;
          return conver;
    }
    
    public double metros_Kilometros(double num){
          double conver = (num * 1)/1000;
          return conver;
    }
    
    public double kilometros_Centimetros (double num){
        double  conver = (this.kilometros_Metros(num));
         return this.metros_Centimetros(conver);
    }
    
    public double centimetros_Kilometros(double num){
        double conver = (this.centimetros_Metros(num));
        return this.metros_Kilometros(conver);
    }

    
    public void setmedidas_Condicional(String valor1 , String valor2 , double num){
       
        if ("cm".equals(valor1) && "m".equals(valor2) ){
            resultados = this.centimetros_Metros(num);
        }
        if ("km".equals(valor1) && "m".equals(valor2) ){
            resultados = this.kilometros_Metros(num);
        }
        if ("m".equals(valor1) && "cm".equals(valor2) ){
            resultados = this.metros_Centimetros(num);
        }
        if ("m".equals(valor1) && "km".equals(valor2) ){
            resultados = this.metros_Kilometros(num);
        }
        if ("cm".equals(valor1) && "km".equals(valor2) ){
            resultados = this.centimetros_Kilometros(num);
            
        }if ("km".equals(valor1) && "cm".equals(valor2) ){
            resultados = this.kilometros_Centimetros(num);
        }
        if ("cm".equals(valor1) && "cm".equals(valor2) ){
            resultados = num;
        }
        if ("m".equals(valor1) && "m".equals(valor2) ){
            resultados = num;
        }
        if ("km".equals(valor1) && "km".equals(valor2) ){
            resultados = num;
        }
        
        
        
        
        
        
    }
        public double getmedidas_Condicional(){
            return resultados;
        }
        
        
        
        
        public static void main(String[] args) {
        Scanner scan =  new Scanner (System.in);
        Conversor_Medidas medidas =  new Conversor_Medidas();
            
            System.out.println("Ingrese la medida y el valor  ?");
            System.out.print
        ("Ingrese su medida"+ 
         "\n cm "+
         "\n m"+
         "\n km");
            String valor1 = scan.next();
        
            System.out.println
        ("Ingrese numero a convertir = ");
            double num =  scan.nextDouble();
            
               System.out.println
        ("A que medidas desea converir"+ 
         "\n cm "+
         "\n m"+
         "\n km");
            String valor2 = scan.next();
            
            medidas.setmedidas_Condicional(valor1, valor2, num);
            System.out.println(medidas.getmedidas_Condicional());
           
    }
        
    }

 
   
    
    
    



