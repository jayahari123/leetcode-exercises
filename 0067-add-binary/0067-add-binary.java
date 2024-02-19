import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2); // Convert binary string a to BigInteger
        BigInteger num2 = new BigInteger(b, 2); // Convert binary string b to BigInteger
        
        BigInteger sum = num1.add(num2); // Add the two BigIntegers
        
        return sum.toString(2); // Convert the sum back to a binary string
    }
}
