//package hust.soict.globalict.aims.media;
//import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Media implements Playable{
    public DigitalVideoDisc(int id, String title, String category, float cost){
        super(id,title, category, cost);
    }

    public String getTitle(){
        return this.title;
    }

    public float getCost(){
        return this.cost;
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getCost());
    }

    public String toString(){
        return "id: "+ id +", title: " + title + ", category: "+ category +", cost: " + cost;
    }

    public static void main(String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "meomeo", "animation", 10);
        dvd1.play();
    }
}