class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String val = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder s = new StringBuilder();
            int count = 1;
            for (int j = 1; j < val.length(); j++) {
                if (val.charAt(j) == val.charAt(j - 1)) {
                    count++;
                } else {
                    s.append(count);
                    s.append(val.charAt(j - 1));
                    count = 1;
                }
            }
            s.append(count);
            s.append(val.charAt(val.length() - 1));
            val = s.toString();
        }   
        return val;
    }
}
