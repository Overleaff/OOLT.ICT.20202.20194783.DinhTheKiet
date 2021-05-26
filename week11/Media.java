//package hust.soict.globalict.aims.media;
abstract class Media {


    public int id;
    public String title;
    public String category;
    public float cost;

    public static final int Max_number_media = 5;
    public static int nbMedia = 0;
    public Media itemMedias[] = new Media[Max_number_media];

//////////////////////ACCESSOR

    public int getId(){
        return id;
    }
/*
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public float getCost(){
        return cost;
    }

////////////////SETTOR
    public abstract String setTitle(String title){
        //this.title = title;
        //return title;
    }
////////////CONSTRUCTOR
*/
    public Media(){
        
    }

    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    

    public void printMedia(){
        System.out.println(this.id+ " - "+this.title + "  -  " + this.category  
         +"  -  " + this.cost);
    }


    

    public String toString(){
        return "id: "+ id +", title: " + title + ", category: "+ category +", cost: " + cost;
    }



    public static void main (String[] args){

    }
}
