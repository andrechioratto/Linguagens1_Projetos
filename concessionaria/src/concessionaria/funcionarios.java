/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author 13.02642-9
 */
public class funcionarios {
    
    private String nome;
    private double comissao;
    private float salarioBase;
    private float salarioDoMes;
    private static int idFunc;
    
    

    public funcionarios(String nome, double comissao, float salarioBase, float salarioDoMes) {
        this.nome = nome;
        this.comissao = comissao;
        this.salarioBase = salarioBase;
        this.salarioDoMes = salarioDoMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioDoMes() {
        return salarioDoMes;
    }

    public void setSalarioDoMes(float salarioDoMes) {
        this.salarioDoMes = salarioDoMes;
    }

    public static int getIdFunc() {
        return idFunc;
    }

    public static void setIdFunc(int idFunc) {
        funcionarios.idFunc = idFunc;
    }
    
}
