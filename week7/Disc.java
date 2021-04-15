public class Disc extends Media {
    public int length;
    public String director;

    public void getLength(int length){
        this.length = length;
    }

    public void getDirector(String director){
        this.director = director;
    }

    public Disc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(){
        super();
    }

    public String toString(){
        return "id: "+ id +", title: " + title + ", category: "+ category +", cost: " + cost
        + "length: " + length + "director: " + director
        ;
    }

    public static void main (String args[]){
        Disc disc1 = new Disc(1,"","",1,1,"");
        System.out.println(disc1.toString());
        
    }
}
