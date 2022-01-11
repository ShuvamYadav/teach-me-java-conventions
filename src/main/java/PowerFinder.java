
public class PowerFinder {
    public static int findPowerOf(int number, int power) {
        int result = 1;
        for (int i = 0; i<power; i++) {
            result *= number;
        }
        return result;
    }
}
