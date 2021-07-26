public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

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

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
}