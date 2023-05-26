import java.util.ArrayList;

public class BerkeleyClockSync {
    public static void main(String[] args) {
        // Initialize the system clocks
        int[] systemClocks = { 10, 12, 13, 11, 14 };
        int masterClock = 0;

        // Print the initial system clocks
        System.out.print("System clocks: ");
        for (int clock : systemClocks) {
            System.out.print(clock + " ");
        }
        System.out.println();

        // Calculate the average system clock
        int sum = 0;
        for (int clock : systemClocks) {
            sum += clock;
        }
        int averageClock = sum / systemClocks.length;

        // Calculate the time adjustment for each system clock
        ArrayList<Integer> timeAdjustments = new ArrayList<>();
        for (int clock : systemClocks) {
            timeAdjustments.add(averageClock - clock);
        }

        // Update the system clocks
        for (int i = 0; i < systemClocks.length; i++) {
            systemClocks[i] += timeAdjustments.get(i);
        }

        // Update the master clock
        masterClock = averageClock;

        // Print the updated system clocks and master clock
        System.out.print("Updated system clocks: ");
        for (int clock : systemClocks) {
            System.out.print(clock + " ");
        }
        System.out.println();
        System.out.println("Master clock: " + masterClock);
    }
}
