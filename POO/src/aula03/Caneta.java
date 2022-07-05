package aula03;

public class Caneta {
//Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

// Estado

    public void status() {
        System.out.print("Modelo: " + this.modelo );
        System.out.print("\nUma caneta " + this.cor);
        System.out.print("\nPonta: " + this.ponta);
        System.out.print("\nCarga " + this.carga);
        System.out.print("\nestá tampada? " + this.tampada);
    }

    // Métodos
    protected void rabiscar(){
        if (this.tampada == true){
            System.out.println("\nErro! Não posso rabiscar");
        } else {
            System.out.println("\nEstou Rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
