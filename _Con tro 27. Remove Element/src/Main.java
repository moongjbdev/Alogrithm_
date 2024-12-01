//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int removeElement(int[] nums, int val) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[r++] = nums[i];
            }
        }
        return r;
    }
}