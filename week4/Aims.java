public class Aims {
    public static void main (String[] args){
        Order anorder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King1", "Animation1", "Roger Allers1", 87, 19.95f);
        anorder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King2", "Animation2", "Roger Allers2", 87, 24.95f);
        anorder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King3", "Animation3", "Roger Allers3", 87, 18.99f);
        anorder.addDigitalVideoDisc(dvd3);
        
        System.out.println(anorder.totalCost());
    }
}