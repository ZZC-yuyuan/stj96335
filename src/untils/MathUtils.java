package untils;

public class MathUtils {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double lerp(double start, double end, double t) {
        return start + t * (end - start);
    }
}