//import hust.soict.globalict.aims.media.Media;
//import hust.soict.globalict.aims.media.Store;
//import hust.soict.globalict.aims.media.Cart;

import java.util.*;

public class Aims {

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("-----------------");
        System.out.println("1. View Store");
        System.out.println("2. Update Store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------------");
        System.out.println("Please chosse a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-----------");
        System.out.println("1. See a Media's details");
        System.out.println("2. Add a Media to cart");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("----------");
        System.out.println("1. Filter Medias in cart");
        System.out.println("2. Sort Medias in cart");
        System.out.println("3. Remove Media from cart");
        System.out.println("4. Get a lucky item from cart");
        System.out.println("5. Place order");
        System.out.println("0. Exit");
        System.out.println("----------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void main(String[] args) {
        MemoryDeamon memmory1 = new MemoryDeamon();
        Thread thread1 = new Thread(memmory1);
        thread1.start();


        Store str = new Store();
        str = str.initalStore();

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
        Aims aims = new Aims();

        Cart anorder = new Cart();
        anorder = anorder.initalCart();


        aims.showMenu();

        int showMenuT = 1;
        while (showMenuT != 0) {
            showMenuT = sc.nextInt();
            switch (showMenuT) {
                case 1:
                    str.printStoreT();
                    aims.storeMenu();
                    int storeMenuT = 1;
                    while (storeMenuT != 0) {
                        storeMenuT = sc.nextInt();
                        switch (storeMenuT) {
                            case 1:// see a media's details
                                break;
                            case 2:
                                System.out.println("input media id to add: ");
                                int intTmp = sc.nextInt();
                                //add mdeia to cart
                                for (int i = 0; i < str.itemsInStore.size(); i++) {
                                    if (str.itemsInStore.get(i).getId() == intTmp) {
                                        try{
                                            anorder.addMedia(str.itemsInStore.get(i));
                                        }catch (LimitExceededException e){
                                            System.err.print(e);
                                        }

                                        System.out.println("input sucessfully");
                                    } else System.out.println("invalid id");
                                }
                                break;
                            case 3:
                                anorder.printCart();
                                aims.cartMenu();
                                int cartMenuT = 1;
                                while (cartMenuT != 0) {
                                    cartMenuT = sc.nextInt();
                                    switch (cartMenuT) {
                                        case 1:
                                            //filter media
                                            System.out.println("not finished");
                                            break;
                                        case 2:
                                            //sort media by id
                                            System.out.println("not finished");
                                            break;
                                        case 3:
                                            //remove item from cart
                                            System.out.println("input id to remove");
                                            int idT = sc.nextInt();
                                            anorder.removeMedia(idT);
                                            break;
                                        case 4:
                                            //get an lucky item from cart
                                            anorder.getAluckyItem();
                                            break;
                                        case 5:
                                            //place order
                                            System.out.println("not finished");
                                        case 0:
                                            break;
                                    }
                                }
                                ////finish while
                                break;
                            case 0:
                                break;
                        }
                    }
                    //////////////finish while
                    break;
                case 2:
                    //add and remove from store
                    System.out.println("1: add to store");
                    System.out.println("2: remove from store");
                    int tmp = sc.nextInt();
                    if (tmp == 1) {
                        System.out.println("input media");
                        int idT = sc.nextInt();
                        String titleT = sc.next();
                        String categoryT = sc.next();
                        int priceT = sc.nextInt();
                        DigitalVideoDisc media1 = new DigitalVideoDisc(idT, titleT, categoryT, priceT);
                        str.addMediaStore(media1);
                        System.out.print("input sucessfully");
                    }
                    if (tmp == 2) {
                        System.out.println("input id to remove");
                        int idT = sc.nextInt();
                        str.removeMediaStore(idT);
                    }
                    break;
                case 3:
                    anorder.printCart();
                    break;
                case 0:
                    break;
            }
        }
////////////////////////////////

        //System.out.println(anorder.totalCost());
        memmory1.run();
    }


}