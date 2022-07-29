import java.util.Scanner;

public class Predio {
    

    static void menu() {
        System.out.println();
        System.out.println("========== MENU ELEVADOR ==========");
        System.out.println("1 - Adiciona pessoas");
        System.out.println("2 - Remove Pessoas");
        System.out.println("3 - Subir andar"); 
        System.out.println("4 - Descer andar");
        System.out.println("9 - Encerra programa");
    }

    public static void main(String[] args) {
         Elevador elevador = new Elevador(10, 20);

        boolean sai = false;
        while (!sai) {
            Scanner prompt = new Scanner(System.in);
            int op, pessoas, andar;

            elevador.painel();
            menu();
            System.out.println("Opção: ");

            op = prompt.nextInt();
            
            // Testa a opção//
            switch (op) {
                case 1:
                    System.out.println("Quantas pessoas?");
                    pessoas = prompt.nextInt();
               elevador.entra(pessoas);
                    break;
                    
                case 2:
                    System.out.println("Quantas pessoas?");
                    pessoas = prompt.nextInt();
                    elevador.sai(pessoas);
                    break;
                    
                case 3:
                    
                    
                    elevador.sobe();
                    break;
                case 4:
                    
                    
                    elevador.desce();
                        break;
                    
                    
                case 9:
                    sai = true;
                    System.out.println("PROGRAMA ENCERRADO !!!");
                    break;
                default:
                    System.out.println("Opção inexistente!");
                    break;

                    

                    

                    
                
            }
        }
    }
}