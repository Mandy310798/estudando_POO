package aula04;

public class aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarelo", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("Molin", "preta", 0.7f);
        c2.status();

        //c1.setModelo("BIC");
        //c1.modelo = "BIC"; é possível chamar o atributo diretamente por ele ser público

        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f; Não é possível a chamada direta do atributo por ele ser privado. Necessário um método Setter

        //System.out.println("Tenho uma caneta " + c1.getModelo()
        //                   + " de ponta " + c1.getPonta()
        //);
    }
}
