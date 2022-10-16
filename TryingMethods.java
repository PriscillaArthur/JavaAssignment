public class TryingMethods {
//This class is for learning about methods in java//
    public static void main(String[] args) {
        TryingMethods priscilla = new TryingMethods();
        System.out.println(priscilla.getDayofTheWeek(1));
    }

    String getDayofTheWeek (int day){
        String dayOfTheWeek="";
        switch (day) {
            case 1:
                dayOfTheWeek="Monday";
                break;
            case 2:
                dayOfTheWeek="Tuesday";
                break;
            case 3:
                dayOfTheWeek="Wednesday";
                break;
            case 4:
                dayOfTheWeek="Thursday";
                break;
            case 5:
                dayOfTheWeek="Friday";
                break;
            case 6:
                dayOfTheWeek="Saturday";
                break;
            case 7:
                dayOfTheWeek="Sunday";
                break;
            default:
                break;
        }
        return dayOfTheWeek;

      }
}
