//package hust.soict.globalict.aims.media;
//import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Books extends Media{
    public int length;
    private List<String> authors = new ArrayList<String>();
    public String content;

    public Books(int id, String title, String category, float cost){
        super(id,title, category, cost);
    }


    public Books(int id, String title, String category, float cost, String content){
        super(id,title, category, cost);
        this.content = content;
    }
    public Books(int id, String title, String category, float cost, int length){
        super(id,title, category, cost);
        this.length = length;
    }

    public int getLength(){
        return this.length;
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

    public String toString(){
        return "id: "+ id +", title: " + title + ", category: "+ category +", cost: " + cost;
    }

    public boolean equals(Object o){
        Books tmp = (Books)o;
        if ( (tmp.getTitle().equals(this.getTitle()) ) && (tmp.getLength() == this.getLength()) )return true;
        return false;
    }

    public Map<String,Integer> wordFrequency;

    public void processContent(){
        List<String> items = Arrays.asList(this.content.split("\\s* \\s*"));
        Map<String, Integer> wordFrequency = items.parallelStream().
        collect(Collectors.toConcurrentMap(
            w -> w, w -> 1, Integer::sum));
        System.out.println(wordFrequency);
    }

    public static void main(String[] args){
        Books book1 = new Books(1,"","",1);
        book1.addAuthor("Kirito");
        book1.addAuthor("Kirito");
        book1.removeAuthor("Kirito1");
        book1.printBook();
    }
}