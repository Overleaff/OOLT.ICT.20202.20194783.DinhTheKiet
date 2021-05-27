public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle(){
        return title;
    }

    public int getLength(){
        return length;
    }

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    public String toStringTrack(){
        return "Title: "+ title +"  Length: "+length;
    }

    public void play() throws PlayerException{
        if (this.getLength() > 0){
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }else{
            throw new PlayerException("ERROR: dvd length is non- positive");
        }
    }

    public static void main (String[] args){
         Track dvd1 = new Track( "meomeo",-1);
        try {
            dvd1.play();
        }catch(PlayerException e) {
            System.err.print(e);
        }
    }
    
}
