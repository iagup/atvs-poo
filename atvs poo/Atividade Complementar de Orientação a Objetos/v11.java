public class v11 {

    public class Endereco{
        private String rua;
        private int numero;
        private String complemento;
        private String cep;
        private String bairro;

    }

    public interface Autenticavel{
        boolean autentica(int senha);
        
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

        public abstract String getNomeCargo(){
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

    public class Gerente extends Funcionario implements Autenticavel{

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

    public class Diretor extends Funcionario implements Autenticavel{

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
        private int senha;
        private String Linguagem;

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

    public class SistemaInterno{

        public boolean autentica(Autenticavel func, int senha){
        if(func.autentica(senha)){
            System.out.println("Usuario logado");
            return true;
        } else {
            System.out.println("Usuario nao logado, problema na autenticação");
            return false;
        }
    }
}

public class Cliente implements Autenticavel{
    private String nome;
    private String sobreNome;
    
    public String getNomeCompleto(){
        return nome.concat(" ").concat(sobreNome);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobreNome(){
        return sobreNome;
    }

    public void setSalario(String sobrenNome){
        this.sobreNome = sobreNome;
    }

    public boolean autentica(int senha){
        return true;
    }
}

    public class Main{
        public static void main(String[] args) {

             Cliente cliente = new Cliente();
             cliente.setNome("Fulano");
             cliente.setSobreNome(" de tal");
             String nomeCompleto;
            
             System.out.println("INICIO SISTEMA");
             try{
                //nomeCompleto = cliente.getNomeCompleto();
                int total = 10/0;
             }catch (NullPointerException e){
                System.out.println(e);
                nomeCompleto = "ocorreu uma exception de NullPointer";
             }catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("ocorreu um erro de calculo");
             } finally{
                System.out.println("SEMPRE EXECUTA");
             }
            //System.out.println(nomeCompleto);
             System.out.println("FIM DO SISTEMA");

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