public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] a =  {{1,2,3}, {3,2,1}, {9,9,9}};
        System.out.println(maximumWealth(a));
    }
}
