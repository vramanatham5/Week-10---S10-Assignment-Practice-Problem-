public class Question1 {
    public static int secondHighest(int[] scores) {
        int highest = -1;
        int secondHighest = -1;

        for (int score : scores) {
            if (score > highest) {
                secondHighest = highest;
                highest = score;
            } else if (score < highest && score > secondHighest) {
                secondHighest = score;
            }
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] sample1 = {45, 78, 92, 78, 60};
        int[] sample2 = {50, 50, 50};

        System.out.println(secondHighest(sample1));
        System.out.println(secondHighest(sample2));
    }
}
