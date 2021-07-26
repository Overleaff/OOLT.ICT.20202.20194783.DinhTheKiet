
public class DigitalVideoDisc {
    public int id;
    public String title;
    public String category;
    public String director;
    public float length;
    public float cost;

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirectory(){
        return director;
    }
    public float getCost(){
        return cost;
    }

    public float getLength(){
        return length;
    }


    public String setTitle(String title){
        this.title = title;
        return title;
    }

    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String directory, String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float length, float cost){
        super();
        this.category = category;
        this.director = director;
        this.title = title;
        this.cost = cost;
    }


    public DigitalVideoDisc(int id, String title, String category, String director, float length, float cost){
        super();
        this.id = id;
        this.category = category;
        this.director = director;
        this.title = title;
        this.cost = cost;
    }

    public int compareByTitle(DigitalVideoDisc dvd){
        return this.title.compareTo(dvd.getTitle());
    }


    public boolean searchByTitle(String title){
        return this.title.contains(title);
    }

    public void display(){
        System.out.println(this.title + "  -  " + this.category + "  -  " + this.director +"  -  " + this.length +"  -  " + this.cost);
    }

    public static void main(String[] args){
        DigitalVideoDisc abc = 
        new DigitalVideoDisc("The Lion King1", "Animation1", "Roger Allers1", 87, 19.95f);
        //System.out.println(abc.searchByTitle("Thet"));
        abc.display();
    }
}