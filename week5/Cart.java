
public class Cart {
    public static final int Max_number_order = 5;
    public static int nbOrders = 0;
    public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_number_order];

    public void addDigitalVideoDisc(DigitalVideoDisc tmp){
        if (nbOrders < Max_number_order){
            itemsOrdered[nbOrders] = tmp;
            nbOrders++;
        }
    }
            private float totalcost;

    public float totalCost(){  
        for (int j = 0; j < nbOrders; j++){
            totalcost += itemsOrdered[j].getCost();
        }
        return totalcost;
    }

    public void addDigitalVideoDisc(int tmp){
        Store Str_tmp = new Store();
            if (nbOrders < Max_number_order){
                itemsOrdered[nbOrders] = Str_tmp.returnDVD(tmp);
                nbOrders++;
            }
    }

    public boolean searchByTitleC(String title){
        for (int i = 0; i < nbOrders; i++){
            if (itemsOrdered[i].searchByTitle(title)) return true;
        }
        return false;
    }

    public void printInput(){
        System.out.println("***********************CART*****************************");
        for (int i = 0; i < nbOrders; i++){
            System.out.println(i+1 + ".DVD - "+ itemsOrdered[i].getTitle()
            +" - " +    itemsOrdered[i].getCategory() 
            +" - " +    itemsOrdered[i].getDirectory() 
            +" - " +    itemsOrdered[i].getLength() 
            +" - " +    itemsOrdered[i].getCost() );
        }
        System.out.println("Total cost: " + this.totalCost() );
        System.out.println("********************************************************");
    }
//////////////////////DISPLAY CART
    public void displayCart(){
        System.out.println("Title     -     category    -    director   -   length   -   cost");
        for (int i = 0; i < nbOrders; i++){
            itemsOrdered[i].display();
        }
    }
///////////////INTIAL CART
    public Cart initalCart(){
        Cart cart1 = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King1CART", "Animation1", "Roger Allers1", 87, 19.95f);
        cart1.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2CART", "Animation2", "Roger Allers2", 87, 24.95f);
        cart1.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King3CART", "Animation3", "Roger Allers3", 87, 18.99f);
        cart1.addDigitalVideoDisc(dvd3);

        return cart1;
    }
///////////////////sorting by title
    public void sortByTitle(){
        for (int i = nbOrders-1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (itemsOrdered[j].compareByTitle(itemsOrdered[j+1]) > 0) 
                    swapInCart(itemsOrdered[j], itemsOrdered[j+1]);
            }
        }  
    }

    public static void swapInCart(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        DigitalVideoDisc tmp = new DigitalVideoDisc(
            dvd1.getTitle(), dvd1.getCategory(), dvd1.getDirectory(), 
            dvd1.getLength(), dvd1.getCost());
        dvd1.title = dvd2.getTitle();
        dvd1.category = dvd2.getCategory();
        dvd1.director = dvd2.getDirectory();
        dvd1.length = dvd2.getLength();
        dvd1.cost = dvd2.getCost();
        ////////////////////
        dvd2.title = tmp.getTitle();
        dvd2.category = tmp.getCategory();
        dvd2.director = tmp.getDirectory();
        dvd2.length = tmp.getLength();
        dvd2.cost = tmp.getCost();
    }

///////////////////sorting bytitle END
    public static void main (String[] args){
        Cart anorder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King3", "Animation1", "Roger Allers1", 87, 19.95f);
        anorder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation2", "Roger Allers2", 87, 24.95f);
        anorder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King1", "Animation3", "Roger Allers3", 87, 18.99f);
        anorder.addDigitalVideoDisc(dvd3);

        anorder.sortByTitle();
        anorder.displayCart();


        //testing swap
        //swapInCart(dvd1, dvd2);

        //testing compare
        //System.out.print(dvd2.compareByTitle(dvd1));

        //testing search
       // anorder.printInput();
       // System.out.println(anorder.searchByTitleC("Lion"));
    }
}
