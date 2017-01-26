/*
Add two Binary Strings, and return their result as a binary String

*/

//Easy Solution
public String addBinary(String a, String b) {
        BigInteger i = new BigInteger(a,2);
        BigInteger j = new BigInteger(b,2);
        BigInteger sum = i.add(j);
        return sum.toString(2);
    }
    

//Solution without build in methods
 public String addBinary(String a, String b) {
    int aLength = a.length();
    int bLength = b.length();
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    
    while(Math.max(aLength, bLength) > 0) {
      int aNum = aLength > 0 ? (a.charAt(aLength---1) - '0') : 0;
      int bNum = bLength > 0 ? (b.charAt(bLength---1) - '0') : 0;
      int cNum = aNum + bNum + carry;
      sb.append(cNum%2);
      carry = cNum / 2;
    }
    return (carry == 1)?sb.append(1).reverse().toString():sb.reverse().toString();
  }
