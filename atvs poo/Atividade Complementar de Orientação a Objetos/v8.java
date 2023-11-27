public class v8 {

    public class Funcionario{
        public String nome;
        public String cpf;
        public double salario;

        public Funcionario(String nome, String sobreNome){
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

            Funcionario funcionario = new Funcionario();
            funcionario.setNome("Fulano");

             Gerente gerente = new Gerente("iago", "fer", 3);
             System.out.println(gerente.getNomeCompleto());

             Diretor diretor = new Diretor();

             Dev dev = new Dev();
             dev.setNome("Fulano");
             dev.setSobrenome("de tal");

             System.out.println(dev.getNomeCompleto()):
        }
    }
}