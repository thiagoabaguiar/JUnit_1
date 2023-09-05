package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }

    public boolean maiorDeIdade() {
        return this.getIdade() >= 18 ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", nascimento=").append(nascimento);
        sb.append('}');
        return sb.toString();
    }

}
