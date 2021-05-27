//package hust.soict.globalict.aims.media;
//import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Media implements Playable{
    public float length;
    public DigitalVideoDisc(int id, String title, String category, float cost){
        super(id,title, category, cost);
    }
    public DigitalVideoDisc(int id, String title, String category, float cost, float length){
        super (id, title, category, cost);
        this.length = length;
    }
    public String getTitle(){
        return this.title;
    }

    public float getCost(){
        return this.cost;
    }

    public float getLength(){
        return this.length;
    }

    public void play() throws PlayerException{
        if (this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: dvd is non- positive");
        }
    }

    public static void main(String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "meomeo", "animation", 10, -1);
        try {
            dvd1.play();
        }catch(PlayerException e) {
            System.err.print(e);
        }

    }
}