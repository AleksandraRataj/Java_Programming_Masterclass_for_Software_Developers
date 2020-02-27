public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true, 2);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
}
