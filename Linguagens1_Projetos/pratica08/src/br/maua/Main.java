package br.maua;

//Importação com mesmo nome tem prioridade para oq importamos, como observado em Dog,
//portanto retiramos a importação de dog e colocamos o pacote.Dog em dog2

import pacote.QualquerCoisa;

public class Main {

    public static void main(String[] args) {
        QualquerCoisa meuQualquerCoisa;// = new QualquerCoisa();
        Dog dog1 = new Dog(30);
        pacote.Dog dog2 = new pacote.Dog(3);
        dog1.bark();
        dog2.bark();
        meuQualquerCoisa.ola();
    }
}
