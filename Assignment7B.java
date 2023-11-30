import java.util.Scanner;
public class Assignment7B {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int y_delta, x_delta, z_delta;  //Create delta values

        System.out.println("[3D Collision Tester]");
        System.out.println("Create Player 1");  //Creating player object using player class
        System.out.println("Enter X position: ");
            int xP = sc.nextInt();
        System.out.println("Enter Y position: ");
            int yP = sc.nextInt();
        System.out.println("Enter Z position: ");
            int zP = sc.nextInt();
        System.out.println("Enter Player Hitbox Width: ");
            int w = sc.nextInt();
        System.out.println("Enter Player Hitbox Height: ");
            int h = sc.nextInt();
        System.out.println("Enter Player Hitbox Depth: ");
            int d = sc.nextInt();
        Player player1 = new Player(w, h, d, xP, yP, zP);

        System.out.println("Create Player 2");  //Creating player two, reusing same variables for clarity
        System.out.println("Enter X position: ");
            xP = sc.nextInt();
        System.out.println("Enter Y position: ");
            yP = sc.nextInt();
        System.out.println("Enter Z position: ");
            zP = sc.nextInt();
        System.out.println("Enter Player Hitbox Width: ");
            w = sc.nextInt();
        System.out.println("Enter Player Hitbox Height: ");
            h = sc.nextInt();
        System.out.println("Enter Player Hitbox Depth: ");
            d = sc.nextInt();
        Player player2 = new Player(w, h, d, xP, yP, zP);

        do {
            //Printing out player positions by using position getters each time in the string
            System.out.println("Player 1 is at (" + player1.getX_Position() + ", " + player1.getY_Position() + ", " + player1.getZ_Position() + ") and Player 2 is at ("+ player2.getX_Position() + ", " + player2.getY_Position() + ", " + player2.getZ_Position() + ")");
            player2.didTheyCollide(player1); //Checks if players have collided. Prints this after describing positions so that user can see where the players went
            System.out.println("Which one do you want to move?");
                int choice = sc.nextInt();

            if (choice == 1) { //if-else statement that are pretty much duplicates, just call different players
                System.out.println("Which direction should Player 1 move (up, down, left, right, forward, or backward)?");
                    String direction_Start = sc.nextLine(); //Creating staring string
                    direction_Start = sc.nextLine();
                    String direction = direction_Start.toLowerCase(); //Assigning lowercase version of staring string to new string; ensures all inputs are taken
                System.out.println("How far should Player 1 move?");
                    int spaces = sc.nextInt();

                switch (direction) {
                    case "up":
                        y_delta = spaces;
                        player1.move_Y(y_delta);
                        break;
                    case "down":
                        y_delta = spaces * -1; //Indicating direction on a graph (up is pos, right is neg, left is pos, etc.)
                        player1.move_Y(y_delta);
                        break;
                    case "left":
                        x_delta = spaces;
                        player1.move_X(x_delta);
                        break;
                    case "right":
                        x_delta = spaces * -1;
                        player1.move_X(x_delta);
                        break;
                    case "backward":
                        z_delta = spaces * -1;
                        player1.move_Z(z_delta);
                        break;
                    case "forward":
                        z_delta = spaces;
                        player1.move_Z(z_delta);
                        break;
                }
            }
            if (choice == 2) {
                System.out.println("Which direction should Player 2 move (up, down, left, right, forward, or backward)?");
                String direction_Start = sc.nextLine();
                direction_Start = sc.nextLine();
                String direction = direction_Start.toLowerCase();
                System.out.println("How far should Player 2 move?");
                int spaces = sc.nextInt();

                switch (direction) {
                    case "up":
                        y_delta = spaces;
                        player2.move_Y(y_delta);
                        break;
                    case "down":
                        y_delta = spaces * -1;
                        player2.move_Y(y_delta);
                        break;
                    case "left":
                        x_delta = spaces * -1;
                        player2.move_X(x_delta);
                        break;
                    case "right":
                        x_delta = spaces;
                        player2.move_X(x_delta);
                        break;
                    case "backward":
                        z_delta = spaces * -1;
                        player2.move_Z(z_delta);
                        break;
                    case "forward":
                        z_delta = spaces;
                        player2.move_Z(z_delta);
                        break;
                }
            }
        }
        while (player1.didTheyCollide(player2) != true && player2.didTheyCollide(player1) != true); //Checks at the end of each loop to determine is collision occurred.
        if (player2.didTheyCollide(player1) == true) {
            System.out.println("Player 1 is at (" + player1.getX_Position() + ", " + player1.getY_Position() + ", " + player1.getZ_Position() + ") and Player 2 is at ("+ player2.getX_Position() + ", " + player2.getY_Position() + ", " + player2.getZ_Position() + ")");
            System.out.println("They collided!"); //Prints player positions, then ending string
        }
    }
}
