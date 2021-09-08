package materiais;

public class Controle {

    String modelo;
    String compatibilidade;
    String cor; 
    String tipo;
    boolean jogar;


    void status() {

        System.out.println(" ");
        System.out.println("[CONTROLE]");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Compatibilidade: " + this.compatibilidade);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tipo);
        System.out.println("O controle é compativel com console? RESPOSTA: " + this.jogar);


    }

    void jogar() {

        if (this.jogar == true) {
            System.out.println("Controle conectado!");
        }
        else {
            System.out.println("O Console não reconhece o Controle!");
        }

    }
    void compativel() {

        this.jogar= true;

    }

    void incompativel() {

        this.jogar = false;


    }
}