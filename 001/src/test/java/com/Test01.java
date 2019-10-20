package com;

import org.junit.Test;

/**
 * 作者：nxl
 * 2019/10/18 0018
 */
public class Test01 {
    @Test
    public void isFlower(){
        int num = 200;
        String address;
        if(num >=100 && num <=999){
            int gw = num % 10,sw = num / 10 % 10,bw = num /100;
            int sum = gw * gw * gw + sw * sw *sw + bw * bw * bw;
             if (sum == num){
                 System.out.println("是");
             }else {
                 System.out.println("不是");
             }
        }else {
            System.out.println("fou");
        }
    }
}
