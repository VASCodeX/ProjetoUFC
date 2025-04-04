import javax.swing.*;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {

        JOptionPane.showMessageDialog(null, "Apresentamos o lutador " + getNome() + ", que tem nacionalidade " + getNacionalidade()
                + " e tem a idade de " + getIdade() + " anos.\n Com a altura de " + getAltura() + "m"
                + " e pesando " + getPeso() + "kg, o que faz com que ele se enquadre na categoria "
                + getCategoria() + ".\n Já tem no seu portfólio " + getVitorias() + " vitoria(s)  e "
                + getDerrotas() + " derrota(s).\n Além de " + getEmpates() + " empate(s).");

    }

    public void status() {
        System.out.println(getVitorias() + "\n" + getDerrotas() + "\n" + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso <= 52) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70) {
            this.categoria = "Leve";
        } else if (this.peso <= 83) {
            this.categoria = "Médio";
        } else if (this.peso <= 110) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
//        System.out.println("APresentamos o desafiante: " + getNome() + ", que tem nacionalidade " + getNacionalidade() + " e tem a idade de " + getIdade() + " anos.\n Com a altura de " + getAltura() + "m"
//        + " e pesando " + getPeso() + "kg, o que faz com que ele se enquadre na categoria " + getCategoria() + ".\n Já tem no seu portfólio " + getVitorias() + " vitorias  e " + getDerrotas() + " derrotas.\n Além de " + getEmpates() + " empates.");
}
