package aula52;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda extends Contato {

    Scanner scan = new Scanner(System.in);
    public Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
            }
        }
        if (cheia){
            throw new AgendaCheiaException();
        }
    }


    @Override
    public String toString(){
        String s = "";
        for (Contato c : contatos){
            s += c.toString() + "\n";
        }
        return s;
    }

}