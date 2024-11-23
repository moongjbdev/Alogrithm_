//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            if (nums[i] == val) {
                for (int j = i; j < (n - 1); j ++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            }else i++;
        }
        return n;
    }
}