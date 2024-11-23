//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(countNum(num) % 2 == 0) count++;
        }
        return count;
    }

    private static int countNum(int num) {
        int result = num;
        int time = 0;
        while (result != 0){
            result /= 10;
            time++;
        }
        return time;
    }

    public static void main(String[] args) {
        int[] nums = {444,444,444,223,244,334};
        System.out.println(countNum(5235));
    }

}