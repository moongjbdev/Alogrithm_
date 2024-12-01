class solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[125];

        for(int i = 0; i < chars.length; i++){
            count[(int)chars[i]]++;
        }

        for (int j = 0; j < chars.length; j++) {
            if(count[(int)chars[j]] == 1){
                return j;
            }
        }
        return -1;
    }
}