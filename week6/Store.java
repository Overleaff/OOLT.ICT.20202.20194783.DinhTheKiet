package hust.soict.globalict.aims.media;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

public class Store {
    public static ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMediaStore(Media tmp){
            itemsInStore.add(tmp);
    }

    public void removeMediaStore(int tmp){
        boolean check = false;
        for (int i = 0; i < itemsInStore.size(); i++){
            if (itemsInStore.get(i).getId() == tmp){
                itemsInStore.remove(i);
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
public Store initalStore(){
    Store Store1 = new Store();
    Media dvd1 = 
        new Media(4, "The Lion King1Store", "Animation1", 84);
    Store1.addMediaStore(dvd1);

    Media dvd2 = 
        new Media(5, "The Lion King2Store", "Animation1", 85);
    Store1.addMediaStore(dvd2);

    Media dvd3 = 
        new Media(6, "The Lion King3Store", "Animation1", 86);
    Store1.addMediaStore(dvd3);

    return Store1;
}

public void printStoreT(){

    for (int i = 0; i < itemsInStore.size(); i++){
        System.out.println(itemsInStore.get(i).toString());
    }  
}
/////////////////////////////////////
    
    public static void main (String[] args){
        Store store1 = new Store();
        store1.initalStore();
        store1.printStoreT();
    }
    
}
