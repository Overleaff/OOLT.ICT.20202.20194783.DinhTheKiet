public class TestPassingParameter {
    public static void main (String[] srgs){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("cinderella");

        wrapper jungleDVD_Wrapper = new wrapper(jungleDVD);
        wrapper cinderella_Wrapper = new wrapper(cinderellaDVD);

        swap (jungleDVD_Wrapper, cinderella_Wrapper);
        System.out.println(jungleDVD_Wrapper.getDVD().getTitle());
        System.out.println(cinderella_Wrapper.getDVD().getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println(jungleDVD.getTitle());
    }

    public static void swap(wrapper o1, wrapper o2){
       DigitalVideoDisc tmp = o1.dvd;
        o1.dvd = o2.dvd;
        o2.dvd = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

}
