
// Java Program to Print the Elements of an Array

// Using forEach() method

import java.util.Arrays;

public class Main {

// main method

public static void main(String[] args) {

// Initialize array of random numbers and size

int[] arr = { -17, 15, 5, 10, 0, 3, 18, 25, 12 };

System.out.println("Elements of the given array are: ");

// Using Arrays.stream() to convert the array to a stream

Arrays.stream(arr)

// printing the elements

.forEach(elem -> System.out.println(elem));

}

}