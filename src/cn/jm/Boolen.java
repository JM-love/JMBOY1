package cn.jm;


import jdk.nashorn.internal.runtime.options.Options;

import java.time.LocalDate;
import java.util.*;

public class Boolen {
    public static void main(String[] args) {

     /* Integer[] arr = new Integer[]{10,5,6,8,2,4,9,3,1,7};

      Integer[] boolOk = boolOk(arr);

        System.out.println(Arrays.toString(boolOk));*/


        /*1，1，2，3，5，8*/
       /* Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("第"+i+"个月有："+fn(i)+"对兔子");*/

      /*  SuShu();*/
        waterFlower();
        waterFlower1();

    }

    public static void waterFlower() {
        int i = 100;
        int x, y, z;

       while(i<=999){
           x = i / 100;
           y = i % 100 / 10 ;
           z = i % 10;

           if(i == (x * x * x) + (y * y * y) + (z * z * z)){
               System.out.println(i);
           }
           i ++;
       }


    }


    public static void waterFlower1() {
        int i = 100;
        int x, y, z;
        System.out.println("=====================");
        while (i <= 999) {

            x = i % 10;
            y = i / 10 % 10;
            z = i / 100;

            if (i == x * x * x + y * y * y + z * z * z) {

                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println(i);
            }
            i++;
        }
    }


    private static int fn(int i) {
        if(i ==1 || i == 2){
            return 1;
        }
        return fn(i-1)+fn(i-2);
    }


    public static void SuShu() {
            int i,j,count=0;
            for(i=101;i<=200;i++) {
                for(j=2;j<=i;j++) {
                    if(i!=j && i%j==0) {
                        break;
                    }if(i==j && i%j==0) {
                        count++;
                        System.out.println(i);
                    }
                }
            }
            System.out.println("101~200之间的素数是"+count+"个");
    }



   /* public static Integer[] boolOk(Integer[] arr){
        int temp = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                  temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
        }
        Optional<java.lang.String> str = Optional.of("zhangsan");
        boolean present = str.isPresent();
        return arr;
    }*/



}
