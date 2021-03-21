public class Order {
    public static final int Max_number_order = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_number_order];

    public int i = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc tmp){
        itemsOrdered[i] = tmp;
        i++;
    }
    private float totalcost;
    public float totalCost(){     
        for (int j = 0; j <= 2; j++){
            totalcost += itemsOrdered[j].getCost();
        }
        return totalcost;
    }
}
