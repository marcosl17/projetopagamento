
package newpackage;


public class GerenteFinanceiro extends Funcionarios{
    private double comissao;
    
    public GerenteFinanceiro(String nome, Double salario, int id) {
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
