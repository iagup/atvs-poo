public class v6 {

    public class CarteiraDeEstudante{
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
        public void setsobreNome(String sobreNome) (
            this.sobreNome = sobreNome;
        )

        public int getIdade(){
            return this.idade;
        }
        
        public void setIdade(int idade) (
            this.idade = idade;

        )
        public boolean isAtivo(){
            return this.ativo;

        }
        public void setArivo(boolean ativo) (
            this.ativo = ativo;

        )
}

    public class Funcionario{
        public String nome;
        public String cpf;
        public double salario;


        public Funcionario(){}

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }

        public double getSalario(){
            return salario;
        }

        public void setSalario(double salario){
            this.salario = salario;
        }

    }

    public class Gerente extends Funcionario{
    
        public int senha;
        public int numeroDeFuncionariosGerenciados;

        public Gerente(){}

        public boolean autentica(int senha){
            if (this.senha == senha){
                System.out.println("Aceddo permitido!");
                return true;
            }else{
                System.out.println("Aceddo negado!");
                return false
            }
        }
    }

    public class Main{
        public static void main(String[] args) {

            Funcionario funcionario = new Funcionario();
             Gerente gerente = new Gerente();
             Gerente.getNome
        }
    }
}