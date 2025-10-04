package controle;

import modelo.Cliente;
import modelo.Veiculo;


public class Principal {


    public static void main(String[] args) {
        System.out.println("--- Cadastro de Novo Cliente ---");
        Cliente cliente1 = new Cliente(
            "123.456.789-00",
            "Carlos Silva",
            "Rua das Flores, 123, São Paulo - SP",
            "(11) 98765-4321",
            "carlos.silva@email.com"
        );

   
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("--------------------------------\n");

        
        System.out.println("--- Controle de Entrada de Veículo ---");
        Veiculo veiculo1 = new Veiculo(
            "ABC-1234",
            "Onix",
            2021,
            "Chevrolet",
            "Prata"
        );

        System.out.println("Entrada de veículo registrada com sucesso!");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Fabricante: " + veiculo1.getFabricante());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Proprietário: " + cliente1.getNome()); // Associando o veículo ao cliente
        System.out.println("------------------------------------");
    }
}