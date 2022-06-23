package aula02;

public class Caneta {
//Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

// Estado

    void status() {
        System.out.print("Modelo: " + this.modelo );
        System.out.print("\nUma caneta " + this.cor);
        System.out.print("\nPonta: " + this.ponta);
        System.out.print("\nCarga " + this.carga);
        System.out.print("\nestá tampada? " + this.tampada);
    }

    // Métodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("\nErro! Não posso rabiscar");
        } else {
            System.out.println("\nEstou Rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
