package zulus.extra;


import java.util.Arrays;

public class BaseTranslator {
    /**
     * Converts an array where the ith digit corresponds to (1 / baseA)^(i + 1)
     * digits[i], return an array output of size precisionB where the ith digit
     * corresponds to (1 / baseB)^(i + 1) * output[i].
     * <p>
     * Stated in another way, digits is the fractional part of a number
     * expressed in baseA with the most significant digit first. The output is
     * the same number expressed in baseB with the most significant digit first.
     * <p>
     * To implement, logically, you're repeatedly multiplying the number by
     * baseB and chopping off the most significant digit at each iteration:
     * <p>
     * for (i < precisionB)
     * 1. Keep a carry, initialize to 0.
     * 2. From RIGHT to LEFT
     * a. x = multiply the digit[i] by baseB and add the carry
     * b. the digit[i] is x % baseA
     * c. carry = x / baseA
     * 3. output[i] = carry
     * <p>
     * If digits[i] < 0 or digits[i] >= baseA for any i, return null If baseA <
     * 2, baseB < 2, or precisionB < 1, return null
     *
     * @param digits     The input array to translate. This array is not mutated.
     * @param baseA      The base that the input array is expressed in.
     * @param baseB      The base to translate into.
     * @param precisionB The number of digits of precision the output should have.
     * @return An array of size precisionB expressing digits in baseB.
     */
    public static int[] convertBase(int[] digits, int baseA, int baseB,
                                    int precisionB) {

        if (digits == null || baseA < 2 || baseB < 2 || precisionB < 1) return null;
        if (digits.length == 0) return new int[0];
        int[] input=Arrays.copyOfRange(digits,0,digits.length);
        for(int x:input){
            if(x<0 || x>=baseA){
                return null;
            }

        }
//        if(baseA==baseB){
//            return digits;
//        }
        int output[] = new int[precisionB];
        for (int i = 0; i < precisionB; i++) {
            int carry = 0;
            for (int j = input.length - 1; j >= 0; j--) {
                int x = input[j] * baseB + carry;
                input[j] = x % baseA;
                carry = x / baseA;
            }
            output[i] = carry;
        }
        return output;
    }

}
