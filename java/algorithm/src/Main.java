import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // final int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	    final int[] nums = {2, 3, -1, -20, 5, 10};
        // max of sub arrays ending at i
	    final int[] localMax = new int[nums.length];
	    localMax[0] = nums[0];
	    for (int i = 1; i < nums.length; i++) {
            localMax[i] = Math.max(localMax[i-1] + nums[i], nums[i]);
        }
        System.out.println(Arrays.toString(localMax));
    }
}
