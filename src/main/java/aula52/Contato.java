package aula52;

public class Contato {

    public static int contador;
    private String nome;
    private int telefone;
    static int id;

    public Contato(){
        contador++;
        id = contador;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        String s = "[";
        s += "Id " + id;
        s += ", Nome " + nome;
        s += ", Telefone " + telefone;
        return s;
    }
}
