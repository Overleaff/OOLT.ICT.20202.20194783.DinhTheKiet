public class Order {
    public static final int Max_number_order = 3;
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

    public void printing(){
        System.out.print("****************Order*********************");
        System.out.println("Date: ");

        System.out.println("Ordered Items");
        System.out.println("Total Cost:");
    }
}
