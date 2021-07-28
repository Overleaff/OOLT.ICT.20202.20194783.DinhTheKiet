public class DigitalVideoDisc {
    public String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int sizeofarray =0;

    public String getTitle(){
        return title;
    }
    public String getCatagory(){
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
    public int getSize(){
        return sizeofarray;
    }



    public String setTitle(String title){
        this.title = title;
        return title;
    }

    public DigitalVideoDisc(String title){
        super();
        this.title = title;
        this.sizeofarray++;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.sizeofarray++;
    }

    public DigitalVideoDisc(String directory, String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.sizeofarray++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.category = category;
        this.director = director;
        this.title = title;
        this.cost = cost;
        this.sizeofarray++;
    }
}