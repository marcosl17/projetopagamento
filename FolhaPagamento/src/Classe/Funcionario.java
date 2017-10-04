package Classe;

/**
 *
 * @author Marcos
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private int idade;
    private String cargo;
    private int ganho;
    private String cidade, estado_sg, sexo;
    private double inss, irrf, fgts, auxtransp;
    
    public Funcionario(){
    }
//    public Funcionario(int codigo, String nome, int idade, String cargo, int ganho) {
//        this.codigo = codigo;
//        this.nome = nome;
//        this.idade = idade;
//        this.cargo = cargo;
//        this.ganho = ganho;
//    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getGanho() {
        return ganho;
    }

    public void setGanho(int ganho) {
        this.ganho = ganho;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado_sg() {
        return estado_sg;
    }

    public void setEstado_sg(String estado_sg) {
        this.estado_sg = estado_sg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }

    public double getAuxtransp() {
        return auxtransp;
    }

    public void setAuxtransp(double auxtransp) {
        this.auxtransp = auxtransp;
    }
    
}
