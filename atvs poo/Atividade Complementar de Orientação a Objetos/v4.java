public class v4 {

    public static CarteiraDeEstudante{
        String nome;
        String sobreNome;
        Int idade;
        boolean ativo;

        CarteiraDeEstudante(){

        }
        CarteiraDeEstudante(String nome){
            this.nome = nome;
            
        }
        CarteiraDeEstudante( String nome, String sobreNome, int idade, boolean ativo){
            this.nome =  nome;
            this.sobreNome = sobreNome;
            this.idade = idade;
            this.ativo = ativo;
        }
        public String getNomeCompleto(){
            return this.nome + " " + this.sobreNome;
        }

        public String getNome(){
            return this.nome;
        }

        public String getSobreNome(){
            return this.sobreNome;
        }

        public int getIdade(){
            return this.idade;
        }
        
        public boolean isAtivo(){
            return this.ativo;

        }
}
    public class main{
        public static void main(Strings[] args){
            CarteiraDeEstudante carteira = new CarteiraDeEstudante("iago","fer", 19, false);
            System.out.println(carteira.getNomeCompleto());

            
        }
    }
}