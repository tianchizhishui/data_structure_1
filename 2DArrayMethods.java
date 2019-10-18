package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr2D = new int[3][];
        for (int i = 0; i < arr2D.length; i ++) {
            arr2D[i] = new int[2];
            for(int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = i + j;
            }
        }
        System.out.println(arr2D[0][0]);
        System.out.println(arr2D[0][1]);
        System.out.println(arr2D[1][0]);
        System.out.println(arr2D[1][1]);
        System.out.println(arr2D[2][0]);
        System.out.println(arr2D[2][1]);



        int[][] arr2D1= new int[3][];
        arr2D1[0] = new int[2];
        arr2D1[1] = new int[3];
        arr2D1[2] = new int[2];

        for (int i = 0; i < arr2D1.length; i++) {
            for (int j = 0; j < arr2D1[i].length; j++) {
                System.out.print(arr2D1[i][j] + " ");
            }
            System.out.println("");
        }



    }
}
