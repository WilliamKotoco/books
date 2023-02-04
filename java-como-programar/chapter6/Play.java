/*
 Criar um joguinho de cassino, brincando com números aleatórios, que vai ter até dinheiro envolvido
 */
import java.util.Scanner;




public class Play{
    public static void main(String[] args)
    {
        Player player = new Player();
        player.starting();  
        int op;
        while (player.currentMoney > -1000 && player.end == false)
        {
        op = displayInfo(player);
        }
    }
    private static int displayInfo(Player player)
    {
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("--------------------------------");
        System.out.println("Displaying information: ");
        System.out.println("Current Money: " + player.currentMoney);
        // ele converte o current money para string e mostra como string
        System.out.println("--------------------------------");
        System.out.println("[1] - crazy roulette wheel");
        System.out.println("[2] - russian roulette");
        System.out.println("[3] - jokenpo");
        System.out.println("[4] - cassino");
        op = input.nextInt();
        return op;
       
    }

 
}
