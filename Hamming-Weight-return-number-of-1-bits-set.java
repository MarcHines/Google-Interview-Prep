/*Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.   */

 public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binary.length(); i++){
         int bit = (n >> i) & 1;
          if(bit == 1)
            count++;
        }
        return count;
    }
    
    //Of course we could just return Integer.bitCount(n);
