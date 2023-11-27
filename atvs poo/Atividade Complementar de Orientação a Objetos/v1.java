public class v1 {

    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[100];
        Integer[] idades = new Integer[100];

        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.next();

        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextint();

        nomes[0] = nomeDigitado;
        nomes[0] = idadeDigitada  
    }

}
    public class CarteiraDeEstudante {
        String nome;
        Integer idade;
    }
    public static void main(String[] args){
        CarteiraDeEstudante[]carteiras = new CarteiraDeEstudante[10];

        CarteiraDeEstudante carteira = new CarteiraDeEstudante();
        carteira.nome = "iago";
        carteira.idade = 19;

        CarteiraDeEstudante carteira1 = new CarteiraDeEstudante();
        carteira.nome = "maria";
        carteira.idade = 64;

        System.out.println(carteira.nome);
        System.out.println(carteira1.nome);

    }

}