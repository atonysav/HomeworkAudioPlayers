package AudioPlayers;

public class Player4 {
    private final int price;
    String[] playlist = {"The best song", "Good song", "Super Song"};

    public Player4(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong(){
        switch (playlist[playlist.length-1]){
            case "The best song" :
            case "Good song" :
            case "Super Song" :
                System.out.println("Player4 - Playing: " + playlist[playlist.length-1]);
        }
    }

    public void playAllSongs(){
        for(String song : playlist){
            System.out.println("Player4 - Playing: " + song);
        }
    }
}
