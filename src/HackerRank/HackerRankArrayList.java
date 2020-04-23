package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < 5; i++) {
            arr.add(new ArrayList<>());
            number = 1;
            while (number != 0) {
                System.out.print("Enter number");
                number = scan.nextInt();
                if (number != 0) {
                    temp.add(number);
                    //System.out.println(temp);
                }
            }
            arr.get(i).addAll(temp);
            temp.clear();
            //System.out.println(arr);
        }

        for (ArrayList<Integer> row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        String query;
        System.out.print("Please enter your query");
        query = scan.next();
        String[] q = query.split(",");
        int indexRow = Integer.parseInt(q[0]) - 1;
        int indexCol = Integer.parseInt(q[1]) - 1;
        try {
            System.out.println(arr.get(indexRow).get(indexCol));
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
    }
