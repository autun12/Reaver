package src.brain;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;

import src.brain.Brain;

public class Learning {

//    Brain brain = new Brain();

    BufferedReader br;
    //String action = brain.input;

    Scanner algorithm = new Scanner(System.in);
    double numbers = algorithm.nextDouble();

    public double x = numbers;
    public double y = numbers;

    public double sum;
    public double difference;
    public double quotient;
    public double product;

    public void Learning() {
       ReaversWordList();
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

    public void Add() {
        sum = x + y;

        System.out.println(sum);
    }

    public double getSum() {
        return sum;
    }

    public void Sub() {
        difference = y - x;

        System.out.println(difference);
    }

    public double getDifference() {
        return difference;
    }

    public void Divide() {        
        quotient = y / x;

        System.out.println(quotient);
    }

    public double getQuotient() {
        return quotient;
    }

    public void Multiplication() {
        product = x * y;

        System.out.println(product);
    }

    public double getProduct() {
        return product;
    }
}