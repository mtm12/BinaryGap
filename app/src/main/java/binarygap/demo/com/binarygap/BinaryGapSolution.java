package binarygap.demo.com.binarygap;

import android.util.Log;

import java.util.Arrays;

/**
 * Created by marct_000 on 10/17/2017.
 */

public class BinaryGapSolution {

    public int solution(int N){
        int solution = 0;
        //convert to binary
        String binary = Integer.toBinaryString(N);
        Log.d("Gap", binary);
        binary = binary.replace("0", " ").trim();
        String[] zeros = binary.split("1");

        if(zeros.length > 0){
            int[] gaps = new int[zeros.length];
            for (int i=0; i < zeros.length; i++){
                gaps[i] = zeros[i].length();
                Log.d("Gap", String.valueOf(gaps[i]));
            }
            Arrays.sort(gaps);
            solution = gaps[gaps.length-1];
        }

        return solution;
    }
}
