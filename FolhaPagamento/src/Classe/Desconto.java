
package Classe;

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
    
    public static double IRRF(double valor){
        if((valor >= 1903.99)&&(valor <= 2826.65)){
            valor = (valor*7.5)/100;
        }else if((valor >= 2826.66)&&(valor <= 3751.05)){
            valor = (valor*15)/100;
        }else if((valor >= 3751.06)&&(valor <= 4664.68)){
            valor = (valor*22.5)/100; 
        }else  if(valor > 4664.68){
            valor = (valor*27.5)/100;
        }
        return valor;
    }
    
    public static double FGTS(double valor){
        valor = (valor*8)/100;
        return valor;
    } 
    
    public static double Auxtransp(double valor){
        valor = (valor*6)/100;
        return valor;
    }
}
