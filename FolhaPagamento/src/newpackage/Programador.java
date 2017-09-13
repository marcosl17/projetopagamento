
package newpackage;


public class Programador extends Funcionarios{
    private double comissao;
    
    public Programador(String nome, double salario, int id) {
        super(nome, salario, id);
    } 

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double getSalario() {
        return super.getSalario() + comissao; 
    }
    
}
