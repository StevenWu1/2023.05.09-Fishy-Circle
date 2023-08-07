import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> fish = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            fish.add(i);
        }
        int curFish = 0;
        while (fish.size() > 1){
            curFish += m;
            while (curFish > (fish.size() - 1)){
                curFish = curFish - fish.size();
            }
            fish.remove(curFish);
        }
        System.out.println(fish.get(0));
    }
}
