import java.util.Scanner;
import java.util.ArrayList;

public class Ods {

    private static ArrayList<String> odsCadastradas = new ArrayList<>();
    
    
    public static void exibirOds() {
        if (odsCadastradas.isEmpty()) {
            System.out.println("\n--- ODS ---");
            System.out.println("Nenhuma ODS foi cadastrada ainda.");
            return;
        }
        
        System.out.println("\n--- ODS DO PROJETO ---");
        for (String ods : odsCadastradas) {
            System.out.println("- " + ods);
        }
    }

    public static void cadastrarOds(Scanner scanner) {
        odsCadastradas.clear(); 
        
        System.out.println("\n--- CADASTRO DE ODS ---");
        char continuar;
        
        do {
            System.out.print("Digite o código e descrição da ODS (ex: ODS 4 - Educação de Qualidade): ");
            String novaOds = scanner.nextLine(); 
            
            odsCadastradas.add(novaOds); 
            
            System.out.print("ODS cadastrada. Deseja inserir outra? (S/N): ");
            String input = scanner.nextLine().toUpperCase();
            
            if (!input.isEmpty()) {
                continuar = input.charAt(0);
            } else {
                continuar = 'N';
            }

        } while (continuar == 'S'); 

        exibirOds();
        
        System.out.println("\nCadastro de ODS concluído! " + odsCadastradas.size());

        System.out.println("====================================================================");

        System.out.print("Pressione ENTER para voltar ao Menu...");
        scanner.nextLine();
    }
}