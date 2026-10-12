package project;
import java.util.Scanner;
public class MiniLoja {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("========================");
        System.out.println("     Lojinha Digital    ");
        System.out.println("========================");
        System.out.println("[1] Ver produtos");
        System.out.println("[2] Comprar produto");
        System.out.println("[3] Ver carrinho");
        System.out.println("[4] Ver saldo");
        System.out.println("[5] Sair");
        System.out.println("Escolha uma opção: ");
        escolha = scanner.nextInt();
        
        switch (escolha){
            case 1:
                System.out.println("Produtos Disponíveis");
                System.out.println("[1] Calça Preta - R$100,00");
                System.out.println("[2] Calça Bege - R$95,00");
                System.out.println("[3] Camiseta Colorida - R$70,00");
                System.out.println("[4] Sapato Social - R$95,00"); 
                break;         
            case 2:
                int compra, quantidade;
                double calcapreta, calcabege, camiseta, sapato;
                System.out.println("[1] Calça Preta - R$100,00");
                calcapreta = 100.00;
                System.out.println("[2] Calça Bege - R$95,00");
                calcabege = 95.00;
                System.out.println("[3] Camiseta Colorida - R$70,00");
                camiseta = 70.00;
                System.out.println("[4] Sapato Social - R$95,00");
                sapato = 95.00;
                System.out.println("Qual gostaria: ");
                compra = scanner.nextInt();
                    if (compra == 1) {
                        System.out.println("Qual a quantidade: ");
                        quantidade = scanner.nextInt();
                        
                        System.out.println("O valor total da compra é: " + quantidade * calcapreta );
                        
                    }else if(compra == 2){
                        System.out.println("Qual a quantidade: ");
                        quantidade = scanner.nextInt();
                        
                        System.out.println("O valor total da compra é: " + quantidade * calcabege);
                        
                    }else if(compra == 3){
                        System.out.println("Qual a quantidade: ");
                        quantidade = scanner.nextInt();
                        
                        System.out.println("O valor total da compra é: " + quantidade * camiseta);
                        
                    }else if(compra == 4){
                        System.out.println("Qual a quantidade: ");
                        quantidade = scanner.nextInt();
                        
                        System.out.println("O valor total da compra é: " + quantidade * sapato);
                    }else{
                        System.out.println("Opção incorreta!");
                        break;
                    }
                    
                     
                           
            
                    
                
                    
            
                
                
    }
        
    }
    
}
