public class DataUtils {
    public static final int Max_number_day = 3;
    public static int nbDay = 0;
    public static MyDate[] Day = new MyDate[Max_number_day];

    public void addDay(MyDate tmp){
        if (nbDay < Max_number_day){
            Day[nbDay] = tmp;
            nbDay++;
        }
    }

    public void printDay(){
        for (int i = 0; i <nbDay; i++){
            System.out.println(Day[i].getDay() +"/"+ Day[i].getMonth()+ "/"+ Day[i].getYear());
        }
        
    }

    public void compare(MyDate tmp1, MyDate tmp2){
        if (tmp1.getYear() < tmp2.getYear()) System.out.print("be hon");
        if (tmp1.getYear() > tmp2.getYear()) System.out.print("lon hon");
        else    {
            if (tmp1.getMonth() < tmp2.getMonth()) System.out.print("be hon");
            if (tmp1.getMonth() > tmp2.getMonth()) System.out.print("lon hon");
            else {
                if (tmp1.getDay() < tmp2.getDay()) System.out.print("be hon");
                if (tmp1.getDay() > tmp2.getDay())  System.out.print("lon hon");
                if (tmp1.getDay() == tmp2.getDay()){
                    System.out.print("bang nhau");
                }
            }
        }

    }

    public int compare1(MyDate tmp1, MyDate tmp2){
        if (tmp1.getYear() < tmp2.getYear()) return 0;
        if (tmp1.getYear() > tmp2.getYear()) return 2;
        else    {
            if (tmp1.getMonth() < tmp2.getMonth()) return 0;
            if (tmp1.getMonth() > tmp2.getMonth()) return 2;
            else {
                if (tmp1.getDay() < tmp2.getDay()) return 0;
                if (tmp1.getDay() > tmp2.getDay())  return 2;
                if (tmp1.getDay() == tmp2.getDay()){
                    return 1;
                }
            }
        }
        return 0;
    }

    public void swap(int i, int j){
        int day_tmp1 =  Day[i].getDay();
        int month_tmp1 = Day[i].getMonth();
        int year_tmp1 = Day[i].getYear();

        int day_tmp2 = Day[j].getDay();
        int month_tmp2 = Day[j].getMonth();
        int year_tmp2 = Day[j].getYear();

        Day[i] = new MyDate(day_tmp2, month_tmp2, year_tmp2);
        Day[j] = new MyDate(day_tmp1, month_tmp1, year_tmp1);
    }

    public static void main (String[] args){
        DataUtils setOfDays = new DataUtils();
        MyDate day1 = new MyDate(22,2,2001);
        setOfDays.addDay(day1);

        MyDate day2 = new MyDate(21,6,2000);
        setOfDays.addDay(day2);

        MyDate day3 = new MyDate(20,6,2001);
        setOfDays.addDay(day3);

        

        setOfDays.compare(day1, day2);
        System.out.println();
        
        
        for (int i = nbDay-1; i >= 0; i--)
            for (int j = 1; j <= i; j++){
                if (setOfDays.compare1(Day[j-1], Day[j]) == 2)
                    setOfDays.swap(j-1, j);
            }
        setOfDays.printDay();
    }
}