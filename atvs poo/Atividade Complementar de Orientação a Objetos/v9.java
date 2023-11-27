public class v9 {

    public class Endereco{
        private String rua;
        private int numero;
        private String complemento;
        private String cep;
        private String bairro;

    }

    public class Funcionario{
        private String nome;
        private String cpf;
        private double salario;
        private Endereco endereco;

        public Funcionario(String nome, String sobreNome){
            super(nome, sobreNome);
            this.nome = nome;
            this.sobreNome = sobreNome;
        }

        public String getNomeCargo(){
            return "Funcionario";
        }


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

        public Gerente( String nome, String sobreNome, int numero de Func){
            super(nome, sobreNome);
            this.numeroDeFuncionariosGerenciados = numeroDeFunc;
        }

        public String getNomeCargo(){
            return "Gerente";
        }
    
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

    public class Diretor extends Funcionario{

        public Diretor(String nome, String sobreNome){
            super(nome,sobreNome);
        }

        public String getNomeCargo(){
            return "Diretor";
        }
    
        public int senha;
        public int numeroDeFuncionariosGerenciados;

        public Diretor(){}

        public boolean autentica(int senha){
            if (this.senha == senha){
                System.out.println("Aceddo permitido!");
                return true;
            }else{
                System.out.println("Aceddo negado!");
                return false
            }
        }

        public int getSenha(){
            return senha;
        }

        public void setSenha(int senha){
            this.senha = senha;
        }
    }

    public class Dev extends Funcionario{

        
        public String Linguagem;

        public String getNomeCargo(){
            return "Dev";
        }

        public String getLinguagem(){
            return linguagem;
        }
        public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }
    }

    public class Main{
        public static void main(String[] args) {

             Dev dev = new Dev();
             dev.setLinguagem("Java");
             Endereco end = new Endereco();
             end.getRua("Rua 1");
             sev.setEndereco(end);

             imprimeNomeCargo(dev):^

             Gerente gerente =  new Gerente("Gerente", "da Silva");

        }

        public void imprimeNomeCargo(Funcionario func){}
        System.out.println(func.getNomeCargo());

        if (func instanceof Dev){
        Dev dev = (Dev) func;
        System.out.println(dev.getLinguagem());
    }else id (func instanceof Gerente){
        Gerente gerente = (gerente) func;
        System.out.println("nao sou dev")
;    }

}