//package hust.soict.globalict.aims.media;
//import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Books extends Media{

    private List<String> authors = new ArrayList<String>();

    public Books(int id, String title, String category, float cost){
        super(id,title, category, cost);
    }


    public void printBook(){
        System.out.println(authors);
    }

    public boolean addAuthor(String authorName){
        for (int i = 0; i < authors.size(); i++){
            if (authors.get(i) == authorName) return false;
        }
        authors.add(authorName);
        return true;
    }

    private int tmp = 0;
    public void removeAuthor(String authorName){
        for (int i = 0; i < authors.size(); i++){
            if (authors.get(i) == authorName){
                authors.remove(i);
                tmp++;
            } 
        }
        if (tmp == 0) System.out.println("authors doesnt exist");
    }

    public static void main(String[] args){
        Books book1 = new Books(1,"","",1);
        book1.addAuthor("Kirito");
        book1.addAuthor("Kirito");
        book1.removeAuthor("Kirito1");
        book1.printBook();
    }
}