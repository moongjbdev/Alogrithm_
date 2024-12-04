public class Solution {

        public static String reformatNumber(String number) {
            //Xu ly xoa - || space

            number = number.replaceAll("[ -]","");
            if(number.length() == 2){
                return number;
            }
            if(number.length() == 4) return number.substring(0,2) + "-" + reformatNumber(number.substring(2,number.length()));
            if(number.length() > 3){
                return number.substring(0,3) + "-" + reformatNumber(number.substring(3,number.length()));
            }
            if(number.length() == 3) return number;
            return "";
        }

    public static void main(String[] args) {
        String string = new String("123 312-4213");
        System.out.println(reformatNumber(string));
    }
}
