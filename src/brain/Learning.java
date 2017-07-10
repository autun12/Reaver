package src.brain;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import src.brain.Brain;

public class Learning {

    Brain brain = new Brain();

    BufferedReader br;
    String action = brain.input;
    int numbers;

    public void Learning() {
       ReaversWordList();
       SimpleMathAlgorithms();
    }

    public static double bayes(double p_a, double p_b, double p_b_a) {
        //P(H|E) = P(H) * P(E|H)
        //         -------------
        //              P(E)

        double p_a_b = (p_b_a * p_a) / p_b;
        
        return p_a_b;
    }

    public void ReaversWordList() {
        try {
            br = new BufferedReader(new FileReader("wordlist/words.txt"));
            try {
                String x;
                while((x = br.readLine()) != null) {
                    System.out.println(x);
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        } catch(FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void SimpleMathAlgorithms() {
        if(action == "add") {
            Add();
        }
        
        if(action == "subtract") {
            Sub();
        }
        
        if(action == "divide") {
            Divide();    
        }
        
        if(action == "multiply") {
            Multiplication();
        }
    }

    public void Add() {
        int x = numbers;
        int y = numbers;
    }

    public void Sub() {
        int x = numbers;
        int y = numbers;
    }

    public void Divide() {
        int x = numbers;
        int y = numbers;
    }

    public void Multiplication() {
        int x = numbers;
        int y = numbers;
    }
}