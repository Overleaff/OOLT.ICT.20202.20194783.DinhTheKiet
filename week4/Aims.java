public class Aims {
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
    }
}