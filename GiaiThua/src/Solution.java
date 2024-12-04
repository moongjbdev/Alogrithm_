import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static int giaiThua(int n){
        if(n == 0) return 1;
        return n *giaiThua(n - 1);
    }

    public static int fibonaci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return n = fibonaci(n-1) + fibonaci(n-2);
    }

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.printf("Chuyển đĩa thứ %d từ cột %c sang cột %c", n,from_rod, aux_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(8));
    }
}
