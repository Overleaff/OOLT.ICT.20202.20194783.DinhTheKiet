//package hust.soict.globalict.aims.media;
//mport hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public int max_number_ordered = 0;

    ///////////////////ADD MEDIA, REMOVE MEDIA
    public void addMedia(Media tmp) throws LimitExceededExcption {
        if (itemsOrdered.size() < max_number_ordered) {
            itemsOrdered.add(tmp);
        } else {
            throw new LimitExceededExcption("ERROR: The number of media has reached its limit");
        }
    }

    public void removeMedia(int tmp) {
        boolean check = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == tmp) {
                itemsOrdered.remove(i);
                check = true;
            }

        }
        if (!check) {
            System.out.println("invalid id");
        } else {
            System.out.println("sucessfully removed");
        }
    }

    ///////////////INTIAL CART and PRINT CART
    public Cart initalCart() {
        Cart cart1 = new Cart();

        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc(1, "The Lion King1CART", "Animation1", 81);

        try {
            cart1.addMedia(dvd1);
        } catch (LimitExceededExcption ex) {
            System.err.print(ex);
        }
        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc(2, "The Lion King2CART", "Animation1", 82);
        try {
            cart1.addMedia(dvd2);
        } catch (LimitExceededExcption ex) {
            System.err.print(ex);
        }

        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc(3, "The Lion King3CART", "Animation1", 83);
        try {
            cart1.addMedia(dvd3);
        } catch (LimitExceededExcption ex) {
            System.err.print(ex);
        }
        return cart1;
    }

    public void printCart() {

        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(itemsOrdered.get(i).toString());
        }
    }


    /////////////////////////LUCKY ITEM
    public void getAluckyItem() {
        int max = itemsOrdered.size();
        int min = 1;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;

        System.out.println("lucky item: " + itemsOrdered.get(rand).toString());
    }

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        cart1.initalCart();
        cart1.printCart();
/*
        cart1.getAluckyItem();
        Books book1 = new Books(1, "", "", 1);
        book1.addAuthor("Kirito");
        book1.addAuthor("Kirito");
        book1.removeAuthor("Kirito1");
        book1.printBook();*/
    }
}
