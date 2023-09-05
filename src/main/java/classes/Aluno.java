package classes;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    
    LocalDate matricula;

    public Aluno(String nome, int idade, boolean ativo) {
        super(nome, idade, ativo);
    }

    public LocalDate getMatricula() {
        return matricula;
    }

    public void setMatricula(LocalDate matricula) {
        this.matricula = matricula;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
