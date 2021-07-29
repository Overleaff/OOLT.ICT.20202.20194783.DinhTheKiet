import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private static ArrayList<Track> listTrack = new ArrayList<Track>();

    public void addTrack(Track tmp){
        listTrack.add(tmp);
    }

public void removeTrack(String title){
    boolean check = false;
    for (int i = 0; i < listTrack.size(); i++){
        if (listTrack.get(i).getTitle().equals(title) ){
            listTrack.remove(i);
            check = true;
        }

    }
    if (!check){
        System.out.println("invalid id");
    }
    else {
        System.out.println("sucessfully removed");
    }
}


///////////////INTIAL CART and PRINT STORE
public CompactDisc initalCDisc(){
CompactDisc cDisc = new CompactDisc();

Track dvd1 = 
    new Track("The Lion King1", 84);
cDisc.addTrack(dvd1);

Track dvd2 = 
    new Track("The Lion King2", 85);
cDisc.addTrack(dvd2);

Track dvd3 = 
    new Track("The Lion King3", 86);
cDisc.addTrack(dvd3);

return cDisc;
}

public void printTrack(){

for (int i = 0; i < listTrack.size(); i++){
    System.out.println(listTrack.get(i).toStringTrack());
    }  
}
/////////////////////////////////////

    public String getArtist(String Artist){
        return Artist;
    }

    int sum=0;
    public int getTotalLength(){
        for (int i = 0; i < listTrack.size(); i++){
            sum += listTrack.get(i).getLength();
        }
        System.out.println("Total Sum: "+ sum);
        return sum;
    }

    public void play(){
        for (int i = 0; i < listTrack.size(); i++){
            listTrack.get(i).play();
        }
    }

    public String toString(){
        return "id: "+ id +", title: " + title + ", category: "+ category +", cost: " + cost +", artist" +artist;
    }
    public static void main(String[] args){
        CompactDisc cDisc = new CompactDisc();
        cDisc.initalCDisc();
        cDisc.removeTrack("The Lion King3");
        
        cDisc.printTrack();
        cDisc.getTotalLength();
        cDisc.play();
    }
}
