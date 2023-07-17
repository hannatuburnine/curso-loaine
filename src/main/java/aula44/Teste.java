package aula44;

public class Teste {

    Papagaio papagaio = new Papagaio();
    Animal animalPapagaio = papagaio; //upcasting

    Animal papagaio2 = (Animal) new Papagaio();
}
