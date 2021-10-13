public class SwitchStatementClass {
    public static void main(String[] args) {

        int weekNum = 3;//TUESDAY
        String week = "";

        switch (weekNum) {
                case 1 : week = "SUNDAY";
                         break;
                case 2 : week = "MONDAY";
                         break;
                case 3 : week = "TUESDAY";
                         break;
                case 4 : week = "WEDNESDAY";
                         break;
                case 5 : week = "THURSDAY";
                         break;
                case 6 : week = "FRIDAY";
                         break;
                case 7 : week = "SATURDAY";
                         break;
        }
        System.out.println(week);
    }
}