package aula44;

public class Teste {

    public static void main(String[] args) {

        Papagaio papagaio = new Papagaio();
        Animal animalPapagaio = papagaio; //upcasting

        Animal papagaio2 = (Animal) new Papagaio();
    }
}
