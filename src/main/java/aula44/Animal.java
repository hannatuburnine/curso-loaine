package aula44;

public abstract class Animal {

    private String nome;

    public abstract void emitirSom();

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }
}
