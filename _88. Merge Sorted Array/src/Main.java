import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int numOfnums2 : nums2){
            addToArray(numOfnums2, nums1, m);
            m++;
        }
    }

    private void addToArray(int numOfnums2, int[] nums1, int m) {
        boolean found = false;
        for(int i = 0; i < m; i++){
            if(nums1[i] > numOfnums2){
                found = true;
                for (int j = m - 1; j >= i; j--){
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = numOfnums2;
                break;
            }
        }
        if(!found){
            nums1[m] = numOfnums2;
        }
    }
}