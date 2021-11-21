import encapsulamento.classes.Cliente;

;public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
        System.out.println("Olá,");
        cliente1.setNome("");

        cliente1.setEndereco("Rua 19-A, 132");
        cliente1.setCpf("6542132546");
        cliente1.setIdade(20);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());

        cliente1.validaCPF();
      
    }
}
