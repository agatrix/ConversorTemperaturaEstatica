package br.edu.ifnmg.conversortempestatico;

/**
 *
 * @author Gustavo
 */
public class Main {
    public static void main(String[] args) {
        ConversorTempEstatico valor = new ConversorTempEstatico(0);
        
        try {
            System.out.println(ConversorTempEstatico.celsiusParaF(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTempEstatico.celsiusParaK(valor));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
    }
}
