package materiais;

public class Skate {

    String modalidade;
    String shape;
    float roda;
    boolean andar;

    void status() {

        System.out.println(" ");
        System.out.println("[SKATE]");
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Shape: " + this.shape);
        System.out.println("Roda: " + this.roda);
        System.out.println("A roda confere com a modalidade? RESPOSTA: " + this.andar);

    }

    void andar() {

        if (this.andar == false) {
            System.out.println("Ei, essa roda não serve!");
        }
        else {
            System.out.println("Já estou andando!!!");
        }


    }
    void boa() {

        this.andar = true;

    }

    void ruim() {

        this.andar = false;

    }
}