package AudioPlayers;

public class Player1 {
    private final int price;

    public Player1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong(String song){
        System.out.println("Player1 - Playing: "+song);
    }
}
