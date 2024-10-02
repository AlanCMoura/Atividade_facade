package Facade;

class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(String gramasBurguer, String tamanhoSobremesa, String mlBebida) {
        this.burguer = new Burguer(gramasBurguer);
        this.sobremesa = new Sobremesa(tamanhoSobremesa);
        this.bebida = new Bebida(mlBebida);
    }

    public void mostrarItensCombo() {
        System.out.println("Combo inclui:");
        if (burguer != null) {
            System.out.println("Burguer: " + burguer.getGramas() + " gramas");
        }
        if (sobremesa != null) {
            System.out.println("Sobremesa: " + sobremesa.getTamanho());
        }
        if (bebida != null) {
            System.out.println("Bebida: " + bebida.getMl() + " ml");
        }
    }
}
