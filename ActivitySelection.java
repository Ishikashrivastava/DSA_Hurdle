import java.util.Arrays;

public class ActivitySelection {
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int act[][] = new int[n][2];
        for(int i = 0; i < start.length; i++){
            int[] activity = new int[]{start[i], end[i]};
            act[i] = activity;
        }
        Arrays.sort(act, (a,b) -> a[1] - b[1]);     
        int maxAct = 1;
        int lastEnd = act[0][1];
        for(int i = 1; i < n; i++){
            if(act[i][0] > lastEnd){
                maxAct++;
                lastEnd = act[i][1];
            }
        }
        return maxAct;
    }
}

