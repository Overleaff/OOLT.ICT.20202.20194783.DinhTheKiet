import java.util.ArrayList;
import java.util.Collections;
public class UpdationW8Testing {

    public static void main(String[] args){
        //POLYMORPHIRSM
        ArrayList<Media> mediae = new ArrayList<Media>();

        Media dvd1 = 
            new DigitalVideoDisc(1, "The Lion King1DVD", "Animation1", 81);
        mediae.add(dvd1);

        Media dvd2 = 
            new Disc(2, "The Lion King2CD", "Animation1", 82, 12,"director");
        mediae.add(dvd2);

        Media dvd3 = 
            new Books(3, "The Lion King3Books", "Animation1", 83,12);
        mediae.add(dvd3);

        for (Media x: mediae){
            System.out.println(x.toString());
        }

        //Couting books frequency
        Books book123 = 
            new Books(4, "OP", "Animation1", 12,"Please note that this returns simply a wrapper on an array a wrapper");
        book123.processContent();    


        //equals
        Media dvdq = 
            new DigitalVideoDisc(1, "tesitingEqualMedia", "Animation1", 98);
        System.out.println(dvdq.equals(dvd2));

        Books dvdb = 
            new Books(3, "The Lion King3Books", "Animation1", 83, 12);
        System.out.println(dvdb.equals(dvd3));

        //compatible 
        Media mediaCom1 = 
            new Media(1, "tesitingCompare1", "Animation1", 98);
        Media mediaCom2 = 
            new Media(3, "testingCompare3", "Animation1", 77);  
        Media mediaCom3 = 
            new Media(2, "testingCompare2", "Animation1", 99);  

        ArrayList<Media> sorting = new ArrayList<Media>();
        sorting.add(mediaCom1);
        sorting.add(mediaCom2);
        sorting.add(mediaCom3);

        Collections.sort(sorting);

        for (Media x: sorting){
            System.out.println(x.toString());
        }

    }
}
