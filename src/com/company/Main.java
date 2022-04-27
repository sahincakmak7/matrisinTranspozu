package com.company;

public class Main {
    public static void main(String args[]){

        int list[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        System.out.println("Matris : ");

        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < list.length; j++){

                System.out.print(list[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("Transpoze : ");

        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < list.length; j++){

                System.out.print(list[j][i] + " ");

            }

            System.out.println();

        }

    }
}