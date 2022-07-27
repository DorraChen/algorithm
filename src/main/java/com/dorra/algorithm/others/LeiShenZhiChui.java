package com.dorra.algorithm.others;

/**
 * @author dorra
 * @date 2022/7/27 17:05
 * @description 雷神之锤3源代码中快速求逆平方根的算法
 */
public class LeiShenZhiChui {
    public static void main(String[] args) {
        float x = 25f;
        System.out.println(invSqrt(x));
    }

//    public static float q_rsqrt(float number) {
//        long i;
//        float x2, y;
//        final float threehalfs = 1.5F;
//        x2 = number * 0.5F;
//        y = number;
//        i = *( long * ) &y; // evil floating point bit level hacking
//        i = 0x5f3759df - (i >> 1); // what the fuck?
//        y = *( float * ) &i;
//        y = y * (threehalfs - (x2 * y * y)); // 1st iteration
//        //  y = y * ( threehalfs - ( x2 * y * y ) ); // 2nd iteration, this can be removed
//        return y;
//    }

    public static float invSqrt(float x) {
        float xhalf = 0.5f * x;
        int i = Float.floatToIntBits(x);
        i = 0x5f3759df - (i >> 1);
        x = Float.intBitsToFloat(i);
        x *= (1.5f - xhalf * x * x);
        return x;
    }
}
