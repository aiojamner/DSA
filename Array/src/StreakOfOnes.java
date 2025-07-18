import java.util.Arrays;

public class StreakOfOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,0,0,0,1,1,1,1};

        System.out.println("Array we have : "+Arrays.toString(arr));
        int maxStreak = 0;
        int currentStreak = 0;

        for (int num : arr){
            if (num == 1){
                currentStreak++;
                maxStreak = Math.max(maxStreak,currentStreak);

            }else {
                currentStreak = 0;
            }
        }

        System.out.println("Maximum Streak : "+maxStreak);
    }
}
