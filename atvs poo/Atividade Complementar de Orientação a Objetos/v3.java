public class v2 {

    public static CarteiraDeEstudante{
        String nome;
        Int idade;
        boolean ativo;

        CarteiraDeEstudante(){

        }
        CarteiraDeEstudante(String nome){
            this.nome = nome;
            
        }
        CarteiraDeEstudante( String nome, int idade, boolean ativo){
            this.nome =  nome;
            this.idade = idade;
            this.ativo = ativo;
        }
}
    public class main{
        public static void main(Strings[] args){
            CarteiraDeEstudante carteira = new CarteiraDeEstudante("iago", 19);
            System.out.println(carteira.nome);

            CarteiraDeEstudante carteira = new CarteiraDeEstudante("iago");
        }
    }
}