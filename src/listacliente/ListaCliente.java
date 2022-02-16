package listacliente;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCliente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Cliente> lista = new ArrayList<>();
        
        System.out.print("Quantos clientes deseja cadastrar ? ");
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < x; i++){
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Saldo: ");
            double saldo = sc.nextDouble();
            lista.add(new Cliente(nome, lista.size()+1, saldo));
            sc.nextLine();
            System.out.println("-------------");
        }
        
        System.out.println();
        System.out.println("Clientes cadastrados com sucesso!");
        System.out.println();
        
        System.out.println("Lista de clientes:");
        System.out.println();
        for(Cliente c : lista){
           System.out.println(c.toString());
        }
       
        System.out.print("Informe qual cliente deseja remover da lista: ");
        String n = sc.nextLine();
        
        //lista.removeIf(f -> f.getNome().equals(n));
        
        System.out.println();
        
        Cliente res = lista.stream().filter(f -> f.getNome().equals(n)).findFirst().orElse(null);
        if(res != null){
            lista.remove(res);
            System.out.println(n + " removido com sucesso!");
        }else{
            System.out.println("Nome inexistente!");
        }
        
        System.out.println();
        System.out.println("Nova Lista: ");
        System.out.println();
        for(Cliente c : lista){
           System.out.println(c.toString());
        }
        
      
    }
    
}
