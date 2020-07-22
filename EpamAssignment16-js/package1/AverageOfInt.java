package package1;

import java.util.*;
public class AvgOfInt {
     public static void main(String args[]){
          Integer[] list = {10,20,30,40,50};
          List<Integer> listNum = Arrays.asList(list);
          double averageRes = average(listNum);
          System.out.println(averageRes);
      }

     private static double average(List<Integer> listNum) {
         return listNum.stream().mapToInt(i -> i).average().getAsDouble();
      }
   }
