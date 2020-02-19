public class SpeedConverter {

    public static void main(String[] args) {

       printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        } else {
            double milesPerHoue = kilometersPerHour / 1.609;
            long roundedMiles = Math.round(milesPerHoue);
            return roundedMiles;
        }
    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
        }
    }
}
