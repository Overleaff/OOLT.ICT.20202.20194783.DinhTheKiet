import java.util.*; 
public class Aims {

    public static void showMenu(){
        System.out.println("AIMS: ");
        System.out.println("-----------------");
        System.out.println("1. View Store");
        System.out.println("2. Update Store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------------");
        System.out.println("Please chosse a number: 0-1-2-3");
    }
    
    public static void storeMenu(){
        System.out.println("Options: ");
        System.out.println("-----------");
        System.out.println("1. See a DVD's details");
        System.out.println("2. Add a DVD to cart");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("----------");
        System.out.println("1. Filter DVDs in cart");
        System.out.println("2. Sort DVDs in cart");
        System.out.println("3. Remove DVD from cart");
        System.out.println("4. Place order");
        System.out.println("0. Exit");
        System.out.println("----------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void main (String[] args){
        Store str = new Store();
        str = str.initalStore();

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
        Aims aims= new Aims();
        
        Cart anorder = new Cart();
        anorder = anorder.initalCart();


        aims.showMenu();

        int showMenuT = 1;
    while (showMenuT != 0){
        showMenuT = sc.nextInt();
        switch (showMenuT){
            case 1: 
                str.displayStore();
                
                aims.storeMenu();
                int storeMenuT = 1;
            while (storeMenuT !=0){
                storeMenuT = sc.nextInt();
                switch(storeMenuT){
                    case 1:
                        break;
                    case 2:
                        System.out.println("input dvd id to add: ");
                        int intTmp = sc.nextInt();

                        anorder.addDigitalVideoDisc(intTmp);
                        break;
                    case 3: 
                        anorder.displayCart();
                        aims.cartMenu();
                        int cartMenuT = 1;
                    while(cartMenuT != 0){
                        cartMenuT = sc.nextInt();
                        switch(cartMenuT){
                            case 1:


                                break;
                            case 2:
                                anorder.sortByTitle();
                                anorder.displayCart();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0: break;
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
                break;
            case 3:
                break;
            case 0: break;
        }
    }   
////////////////////////////////
        
        //System.out.println(anorder.totalCost());
    }
}