package AudioPlayers;

public class Player3 {
    private final int price;
    String[] playlist = {"The best song", "Good song", "Super Song"};

    public Player3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong(){
        System.out.println("Player3 - Playing: " + playlist[0]);
    }

    public void playAllSongs(){
        System.out.println("Player3 - Playing: " + playlist[0] + ".\n" + "Next song: " + playlist[1] + ".\n" + "Next song: "+ playlist[2] + ".\n" + "The end of playlist.");
    }
}
