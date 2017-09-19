
package newpackage;

public class Desconto {
    
    public static double INSS(double valor){
        if(valor <= 1659.38){
            valor = (valor*8)/100;
        }else if((valor >= 1659.39)&&(valor <= 2765.66)){
            valor = (valor*9)/100;
        }else if((valor >= 2765.67)&&(valor <= 5531.31)){
            valor = (valor*11)/100;
        }else{
            valor = (5531.31*11)/100; 
        }
        return valor;
    }
}
