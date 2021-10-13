public class SwitchExpressionClass {
    public static void main(String[] args) {
        
        int weekNum = 3;//TUESDAY

        String week = switch (weekNum) {
                        case 1 -> "SUNDAY";
                        case 2 -> "MONDAY";
                        case 3 -> "TUESDAY";
                        case 4 -> "WEDNESDAY";
                        case 5 -> "THURSDAY";
                        case 6 -> "FRIDAY";
                        case 7 -> "SATURDAY";
                        default -> throw new IllegalStateException("Invalid day");
                      };

        System.out.println(week);
    }
}