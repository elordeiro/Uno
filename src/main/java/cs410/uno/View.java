package cs410.uno;

public class View {
    public static void start() {
        println("Starting game...\n");
    }

    public static void preTurn(GameState game) {
        println(game);
    }

    public static void preEval(Player player, Card card) {
        println(player.getName() + " played " + card + "\n");
    }
    
    public static void drawTwo(Player player) {
        println(player.getName() + " drew two cards and was skipped..." + "\n");
    }

    public static void skip(Player player) {
        println(player.getName() + " was skipped...\n");
    }

    public static void reverse() {
        println("Game direction was reversed...\n");
    }
    
    public static void drawing(Player player) {
        println(player.getName() + " drew a card");
    }

    public static void noValid(Player player) {
        println(player.getName() + " didn't have a valid card to play\n");
    }

    public static void gameOver(String player) {
        println("Game over!");
        println("Winner: " + player);
    }
    
    /**
     * I'm lazy.
     * @param o
     */
    private static void println(Object o) {
        System.out.println(o);
    }
}
