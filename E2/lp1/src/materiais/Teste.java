package materiais;

public class Teste {

    public static void main(String[] args) {

        //CANETAS
        Caneta c1 = new Caneta();
        c1.modelo = "esferográfica";
        c1.cor = "preto";
        c1.carga = true;
        c1.ponta = 0.5f;
        c1. tampar();
        c1.status();
        c1.escrever();

        Caneta c2 = new Caneta();
        c2.modelo = "gel";
        c2.cor = "rosa";
        c2.carga = true;
        c2.ponta = 0.38f;
        c2. destampar();
        c2.status();
        c2.escrever();



        //SKATES
        Skate s1 = new Skate();
        s1.modalidade = "Down Hill";
        s1.shape = "preto";
        s1.roda = 60f;
        s1.boa();
        s1.status();
        s1. andar();

        Skate s2 = new Skate();
        s2.modalidade = "Down Hill";
        s2.shape = "roxo";
        s2.roda = 49f;
        s2.ruim();
        s2.status();
        s2. andar();



        //CONTROLES
        Controle co1 = new Controle();
        co1.modelo = "One WL3-00106";
        co1.compatibilidade = "xbox one";
        co1.cor = "preto";
        co1.tipo = "joystick";
        co1.compativel();
        co1.status();
        co1.jogar(); 

        Controle co2 = new Controle();
        co2.modelo = "Knup KP-5121A";
        co2.compatibilidade = "xbox 360";
        co2.cor = "preto";
        co2.tipo = "joystick";
        co2.incompativel();
        co2.status();
        co2.jogar(); 


    }
}