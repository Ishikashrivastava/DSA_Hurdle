public class maxsum {
    import java .util.*;

public class maxsum{
    public static void maxsum(int num []) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                cursum = 0;
                for (int k = start; k < +end; k++) {
                    cursum += num[k];

                }
                System.out.println(cursum);
                if (maxsum < cursum) {
                    maxsum = cursum;

                }

            }
        }
        System.out.println("max sum of array: " + maxsum);
    }

        public static void main(String[] args) {
            int num []= {1,2,3,4,5};
            maxsum(num);

        }
}
    
}
