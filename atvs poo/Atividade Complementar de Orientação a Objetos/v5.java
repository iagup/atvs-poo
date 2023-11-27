public class v5 {

    public static CarteiraDeEstudante{
        private String nome;
        private String sobreNome;
        private Int idade;
        private boolean ativo;

        public CarteiraDeEstudante(){

        }
        public CarteiraDeEstudante(String nome){
            this.nome = nome;
            
        }
        public CarteiraDeEstudante( String nome, String sobreNome, int idade, boolean ativo){
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

        public void setNome(String nome) (
            this.nome = nome;
        )

        public String getSobreNome(){
            return this.sobreNome;
        }
        public void setNome(String sobreNome) (
            this.sobreNome = sobreNome;
        )

        public int getIdade(){
            return this.idade;
        }
        
        public void setNome(int idade) (
            this.idade = idade;

        )
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