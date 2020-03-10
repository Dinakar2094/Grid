package com.example.alphabets;

public  class GetAlphabets {

    static String getValues(String language) {

        if (language.equals("english")) {
            return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
        }
       else{
           return "No Alphabets For This Language";
        }
    }
}