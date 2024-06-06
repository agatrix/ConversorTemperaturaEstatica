package br.edu.ifnmg.conversortempestatico;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        ConversorTempEstatico valor = new ConversorTempEstatico(-5);
        //Passamos o objeto valor pois os métodos estaticos não sabem
        //quais os valores, se ele não tiver o objeto de referência
        try {
            System.out.println("Celsius para F: "+ConversorTempEstatico.celsiusParaF(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println("Celsius para K: "+ConversorTempEstatico.celsiusParaK(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
         try {
            System.out.println("fahrenheit para K: "+ConversorTempEstatico.fahrenheiParaK(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println("fahrenheit para C: "+ConversorTempEstatico.fahrenheitParaC(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println("Kelvin para C: "+ConversorTempEstatico.kelvinParaC(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println("Kelvin para F: "+ConversorTempEstatico.kelvinParaF(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
    }
}
