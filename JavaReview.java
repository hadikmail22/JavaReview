/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javareview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author dodoq
 */
public class JavaReview {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //task3
        int Level = 4;
        double GPA = 95.6;
        boolean isStudent = true;
        char Score = 'A';
        
        System.out.println(' ');
        
        
        
        // Arithmetic
        
        System.out.println("GPA - 20 = " + (GPA - 20));
        System.out.println("GPA * 2 = " + (GPA * 2));
        System.out.println("GPA / 2" + (GPA / 2));
        
        System.out.println(' ');
        
         // Comparison
         
        System.out.println(GPA > 50);
        System.out.println(Level == 3);
        System.out.println(isStudent != true);
        
        System.out.println(' ');
        
          // Logical
          
        System.out.println(isStudent && GPA > 70);
        System.out.println(isStudent || Level < 4);
        System.out.println(!isStudent);
        
        System.out.println(' ');
        
       
   
        
        //task4
        // if/else
        int number = 15;
        if (number % 2 == 0) {
            System.out.println(number + " even ");
        } else {
            System.out.println(number + " odd ");
        }
        
        System.out.println(' ');

        
        
        String LevelText;
        switch (Level) {
            case 1:
                LevelText = "week";
                break;
            case 2:
                LevelText = "acceptable";
                break;
            case 3:
                LevelText = "good";
                break;
            case 4:
                LevelText = " very good ";
                break;
            case 5:
                LevelText = "eceellent";
                break;
            default:
                LevelText = "not correct";
        }
        System.out.println("level " + Level + " mean " + LevelText);
        
        System.out.println(' ');

        // for loop mul
        int num = 7;
        System.out.println("multiplication table " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println(' ');

        // while loop , sum until 0 , from 5 as example
        int Sum = 0;
        int input = 5; 
        while (input > 0) {
            Sum += input;
            input--; 
        }
        System.out.println("the sum of 5 to 0 = " + Sum);
        
        System.out.println(' ');
        
        //task5
        // helper methods 1.isEven
        
        int Num = 2;
        boolean Result = isEven(Num);
        System.out.println(Num + " are even? " + Result);
        
        System.out.println(' ');
        
         // helper methods 2. factorial
         
         long NumFactorial = 5;
         long ResultFactorial = factorial(NumFactorial);
         System.out.println("the factorial of " + NumFactorial + " is : " + ResultFactorial);
         
         System.out.println(" ");
         
         // helper methods 3.  reverse
         
         String Text ="change";
         String ReverseResult=Reverse(Text);
         System.out.println(" the reverse of text change is : " + ReverseResult);
         
         System.out.println(" ");
         
         //task6
         //random numbers
          System.out.println("the indexs of array is :");
         int[] arr = new int[10];
        Random random =new Random();
        
        for(int i=0;i<arr.length;i++)
        {
          arr[i] = random.nextInt(100);
          System.out.println(arr[i]);
        
        }
        
        // min
        System.out.println(" ");
        
        int min=arr[0];
        for (int i=0; i<arr.length ;i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        
        }
        System.out.println("the min");
        
        System.out.println(min);
        
        System.out.println(" ");

        // max
        
        int max=arr[0];
        for (int i=0; i<arr.length ;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        
        }
        System.out.println("the max");

        System.out.println(max);
        
        System.out.println(" ");

        //average
        
        int ArraySum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            ArraySum=ArraySum+arr[i];
        }
        
        System.out.println("the average");

        System.out.println(ArraySum/arr.length);
        
        System.out.println(" ");
                 
         //task7        
          
        String Sentence= " UBS company";
        
        //length()
        System.out.println("the length of sentence (Ubs comapny) is : ");
        System.out.println(Sentence.length());
        System.out.println(" ");
         
         //charAt()
        System.out.println("the chart at 5 : ");
        System.out.println(Sentence.charAt(5));
        System.out.println(" ");
         
         //substring()
         System.out.println("the sentence from 1 to 5 of (Ubs comapny) is : ");
         System.out.println(Sentence.substring(1,5));
         System.out.println(" ");
         
         //replace
         System.out.println("replace the U to y : ");
         System.out.println(Sentence.replace("U","y"));
         System.out.println(" ");
         
         //split
         System.out.println("the split of sentence is : ");
         String[] array = Sentence.split(" ");
         
         for(int i=1;i<array.length;i++)
         {
             System.out.println(array[i]);
             System.out.println(" ");
         }
         System.out.println(" ");
         
         //trim 
          System.out.println("trim :");
          System.out.println(Sentence.trim());
          System.out.println(" ");
          
          
          //toUpperCase
          System.out.println("toUpperCase : ");
          System.out.println(Sentence.toUpperCase());
          System.out.println(" ");
         
         //task8
         
         
        try {
            int result = divide(10, 0);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        
        //task9
        
       System.out.println(" ");
       System.out.println(" arraylist : ");
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Ahmad");
        names.add("Sara");
        names.add("Lina");
        names.add("Omar");

        for (String name : names) {
            System.out.println(name);
        }

        names.remove("Sara");

        System.out.println("After removing:");

        for (String name : names) {
            System.out.println(name);
        }
        
        System.out.println(" ");
        
        System.out.println("HashMap");
        //task10
        
      HashMap<String,Integer> StudentScore = new HashMap<>();
      StudentScore.put("khled",75);
      StudentScore.put("demaa",98);
      StudentScore.put("noor",100);
      
      for (Map.Entry<String, Integer> entry : StudentScore.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
      
      
      System.out.println(" ");
      //task11
      
          Student student = new Student("hadi", 2023001, 95.5);

        Course c1 = new Course("Java", "CS101");
        Course c2 = new Course("Database", "CS102");
        Course c3 = new Course("Networks", "CSE103");

        student.enrollCourse(c1);
        student.enrollCourse(c2);
        student.enrollCourse(c3);

        student.printReport();      
                 

         

         
        
        
        
        
    }
        private static boolean isEven(int num)
        {
            return num % 2 == 0;
        }
        private static long factorial(long num)
        {
            long result = 1;
            for (int i=1;i<=num;i++)
            {
                result = result * i;
            }
            return result;
                
        }
        private static String Reverse(String str)
        {
            String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
        }
        
          public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
        
        
        
        
}

        
        
        
        
        
    


