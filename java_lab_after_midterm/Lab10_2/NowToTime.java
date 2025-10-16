public class TimeConverter {
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        int seconds = (int) (totalSeconds % 60);
        int minutes = (int) ((totalSeconds / 60) % 60);
        int hours   = (int) ((totalSeconds / 3600) % 24);
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        long nowMillis = System.currentTimeMillis();
        System.out.println("Current time (h:m:s): " + convertMillis(nowMillis));
    }
}