package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Throwing MyException from ");
        throw new Exception("From f()");
    }
    public static void main(String[] args) {
        try {
            main(String[] args);
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }

    }
}

