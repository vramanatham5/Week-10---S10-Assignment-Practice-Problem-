import java.util.Arrays;

public class Question3 {
    public static String[] rotateRoster(String[] names, int k) {
        int length = names.length;
        int shift = k % length;
        String[] rotated = new String[length];

        for (int i = 0; i < length; i++) {
            rotated[(i + shift) % length] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};

        System.out.println(Arrays.toString(rotateRoster(names, 2)));
        System.out.println(Arrays.toString(rotateRoster(names, 7)));
    }
}
