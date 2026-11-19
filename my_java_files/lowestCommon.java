public static int lowestCommon(long a, long b) {
        long commonBits = a&b;
        int answer = -1;
        for(int i = 0; i<64; i++) {
            if((commonBits & (1L<<i)) != 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }