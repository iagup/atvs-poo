public class v2 {

    public static CarteiraDeEstudante{
        String nome;
        Int idade;
        boolean ativo;
}
    public class main{
        public static void main(Strings[] args){
            CarteiraDeEstudante carteira = new CarteiraDeEstudante();
            carteira.nome = "iago";
            carteira.idade = 19;

            CarteiraDeEstudante carteira2 = carteira;
            carteira2.idade = 20;
            System.out.println(carteira.idade);
        }
    }
}