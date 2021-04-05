public class Store {
    public static final int Max_number_DVD = 15;
    public static int nbDVD = 0;
    public static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[Max_number_DVD];

    public void addDVD(DigitalVideoDisc tmp){
            itemsInStore[nbDVD] = tmp;
            nbDVD++;
    }
    private int tmp;

    public static DigitalVideoDisc returnDVD(int tmp){
        for (int i = 0; i < nbDVD; i++){
            if (itemsInStore[i].getId() == tmp) return itemsInStore[i];
        }
        System.out.print("1");
        return null;
    }

    public void removeDVD(String title){
        for (int i = 0; i < nbDVD; i++){
            if (itemsInStore[i].searchByTitle(title)) tmp = i;
        }
        nbDVD--;
        for (int i = tmp; i < nbDVD; i++){
            itemsInStore[i] = itemsInStore[i+1];
        }
    }



    public void displayStore(){
        System.out.println("Title     -     category    -    director   -   length   -   cost");
        for (int i = 0; i < nbDVD; i++){
            itemsInStore[i].display();
        }
    }

    public Store initalStore(){
        Store store1 = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King1STORE", "Animation1", "Roger Allers1", 87, 19.95f);
        store1.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"The Lion King2STORE", "Animation2", "Roger Allers2", 87, 24.95f);
        store1.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"The Lion King3STORE", "Animation3", "Roger Allers3", 87, 18.99f);
        store1.addDVD(dvd3);

        return store1;
    }
    
    public static void main (String[] args){
        Store store1 = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King1", "Animation1", "Roger Allers1", 87, 19.95f);
        store1.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation2", "Roger Allers2", 87, 24.95f);
        store1.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King3", "Animation3", "Roger Allers3", 87, 18.99f);
        store1.addDVD(dvd3);

    }
    
}
