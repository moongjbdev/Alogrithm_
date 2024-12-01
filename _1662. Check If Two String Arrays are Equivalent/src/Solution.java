class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();

        for(String s : word1){
            r1.append(s);
        }
        for(String s : word2){
            r2.append(s);
        }
        return  r1.equals(r2);
    }

    public static void main(String[] args) {
        // Với String
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i; // Mỗi lần nối tạo một đối tượng String mới
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (endTime - startTime) + "ms");

        // Với StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Nối trực tiếp vào đối tượng StringBuilder
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (endTime - startTime) + "ms");

    }

}