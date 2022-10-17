public class TryingMethods {
//This class is for learning about methods in java//
    public static void main(String[] args) {
        TryingMethods priscilla = new TryingMethods();
        System.out.println(priscilla.getDayofTheWeek(1));
        priscilla.weightCheck(52);

        System.out.println(whileloop());
    
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
      public void weightCheck (int weight){
        if (weight >=70) {
            System.out.println("Obese");
        }
        else if (weight >= 50 && weight <=69) {
            System.out.println("Normal");
        }
        else if (weight <=49) {
            System.out.println("underweight");
        }
     }
    
    public static int whileloop () {
        int sum=0, i=1;
        while(i<1000){
            sum+=i;
            i++;
        }
        return sum;    
    }
}



