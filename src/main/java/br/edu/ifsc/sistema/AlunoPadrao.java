package br.edu.ifsc.sistema;

public final class AlunoPadrao implements Aluno{
    private final Nome nome;
    private final Email email;
    private final Telefone telefone;
    public AlunoPadrao(Nome nome, Email email, Telefone telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    @Override
    public Nome nome() {
        return this.nome;
    }

    @Override
    public Email email() {
        return this.email;
    }

    @Override
    public Telefone telefone() {
        return this.telefone;
    }
}
