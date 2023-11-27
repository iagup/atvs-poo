public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    public void abre() {
        aberta = true;
    }
    public void fecha() {
        aberta = false;
    }
    public void pinta(String s) {
        cor = s;
    }
    public boolean estaAberta() {
        return aberta;
    }
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.pinta("Azul");
        System.out.println("Cor da porta: " + porta.cor);
    }
}
