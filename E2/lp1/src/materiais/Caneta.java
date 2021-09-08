package materiais;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    boolean carga;
    boolean tampada;

    void status() {

        System.out.println(" ");
        System.out.println("[CANETA]");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta está tampada? RESPOSTA: " + this.tampada);

    }

    void escrever() {

        if (this.tampada == true) {
            System.out.println("PERAI! Não posso escrever");
        }
        else {
            System.out.println("Estou escrevendo");
        }


    }

    void tampar() {

        this.tampada = true;

    }

    void destampar() {

        this.tampada = false;

    }
}