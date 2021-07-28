public class Order {
    public static final int Max_number_order = 6;
    public static int nbOrders = 0;
    public int qtyOrdered = 2;
    public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_number_order];

    public void addDigitalVideoDisc(DigitalVideoDisc tmp){
        if (nbOrders < Max_number_order){
            itemsOrdered[nbOrders] = tmp;
            nbOrders++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (nbOrders+1 < Max_number_order){
            itemsOrdered[nbOrders] = dvd1;
            nbOrders++;
            itemsOrdered[nbOrders] = dvd2;
            nbOrders++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvd){
        for (DigitalVideoDisc x: dvd){
            itemsOrdered[nbOrders] = x;
            nbOrders++;
        }
    }
/*
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1[]){
        if (nbOrders+dvd1[0].getSize()-1 < Max_number_order){
             for (int i = 0; i < dvd1[0].getSize(); i++){
                  this.addDigitalVideoDisc(dvd1[i]);
            }
        }
    }
*/
    private float totalcost;
    public float totalCost(){     
        for (int j = 0; j < nbOrders; j++){
            totalcost += itemsOrdered[j].getCost();
        }
        return totalcost;
    }

    public void printing(){
        System.out.print("****************Order*********************");
        System.out.println("Date: ");

        System.out.println("Ordered Items");
        System.out.println("Total Cost:");
    }


    public static void main (String[] args){
        Order anorder = new Order();

//testing add ont or two or three dvd
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King1", "Animation1", "Roger Allers1", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation2", "Roger Allers2", 84, 29.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King3", "Animation3", "Roger Allers3", 82, 11.99f);
        anorder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        //testing add an array
        DigitalVideoDisc array[] = new DigitalVideoDisc[Max_number_order];
            array[0] = dvd1;
            array[1] = dvd2;
            array[2] = dvd3;
       // anorder.addDigitalVideoDisc(array);
        
        System.out.println(anorder.totalCost());
        //PHAN addDigitalVideoDisc(array) khong duoc declare cung voi 
        //addDigitalVideoDisc(dvd1,dvd2,dvd3) nen em de mot cai trong phan ignore code
    }
}
