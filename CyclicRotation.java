/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author exk
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A.length == K || A.length<=1) {
            return A;
        }
        int numOfRation = K;
        if (K > A.length) {
            numOfRation = K % A.length;
        }
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if ((i + numOfRation) >= A.length) {
                arr[i + numOfRation - A.length] = A[i];
            } else {
                arr[i + numOfRation] = A[i];
            }
        }
        return arr;
    }
}
