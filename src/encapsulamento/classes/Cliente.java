package encapsulamento.classes;
import java.util.Scanner;

public class Cliente {
    private Scanner scanner = new Scanner(System.in);
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;


    public Cliente (){
    }

     public String getNome(){
        return nome;
     }
     
     public void setNome(String nome) {
        System.out.print("Digite seu nome:");
        nome = scanner.nextLine();
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        
        return cpf;

    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
        


    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean validaCPF(){
        if (cpf.length() != 11){
            System.out.println("CPF INVALIDO ");
       
        return false; }  
        else {
            System.out.println("CPF INSERIDO VALIDO");
            return true;
        } 
    }



}
