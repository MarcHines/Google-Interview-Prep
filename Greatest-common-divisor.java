private static int findGCD(int number1, int number2) {
        if(number2 == 0) return number1;

        return findGCD(number2, number1 % number2);
    }
