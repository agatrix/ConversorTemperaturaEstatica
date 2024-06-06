package br.edu.ifnmg.conversortempestatico;

/**
 * Classe que converte um valor de um objeto, de uma temperatura para
 * outra; Utilizando métodos estáticos.
 * @author Gustavo
 */
public class ConversorTempEstatico {
    private double valor;
    
    //<editor-fold defaultstate="collapsed" desc="Métodos Padrões">
    public ConversorTempEstatico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos Celsius">
    public static double celsiusParaK(ConversorTempEstatico x) throws Exception {
        if(x.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor + 273.15);
    }
    
    public static double celsiusParaF(ConversorTempEstatico x) throws Exception{
        if(x.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
    
        return (x.valor*9/5) + 32;
    }        
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos Fahrenheit">
    public static double fahrenheitParaC(ConversorTempEstatico x) throws Exception {
        if(x.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
          
        return ((x.valor - 32) * 5/9);
    }
    
    public static double fahrenheiParaK(ConversorTempEstatico x) throws Exception{
        if(x.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor-32)*5/9+273.15;
    }     
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos Kelvin">
    public static double kelvinParaC(ConversorTempEstatico x) throws Exception{
        if(x.valor < 0)
            throw new Exception("O valor passado é menor que o zero absoluto");
         
        return x.valor-273.15;
    }
    
    public static double kelvinParaF(ConversorTempEstatico x) throws Exception{
        if(x.valor < 0)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor - 273.15)*9/5+32;
    }
    //</editor-fold>
}
