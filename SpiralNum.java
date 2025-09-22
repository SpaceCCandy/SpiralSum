public class SpiralNum {
    public static void main(String[] args) {
        int Sum, Curr, Jumps, DIGITS; // Variables
        Sum = 1; // Keeps track of sum
        DIGITS = 1001; // Elements in the spiral
        Curr = 1; // Keeps track of current number/ To be added number
        Jumps = 2; // How much to increase Curr by

        while (Curr < (DIGITS*DIGITS)) {
            for (int i = 0; i < 4; i++) { // Happens 4 times
                Curr += Jumps; // Increase Curr
                Sum += Curr; // Add Curr to Sum(1 + 3 + 5...)
            }
            Jumps += 2; // After 4 turns(4 corners) increase Jump by 2
        }

        System.out.println(Sum); // Prints answer =D
    }
}
