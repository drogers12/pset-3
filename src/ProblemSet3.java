/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        //ps.sign();          // executes Exercise 1    Done
        //ps.parity();        // executes Exercise 2    Done
        //ps.ordered();       // executes Exercise 3    Done
        //ps.gpa();           // executes Exercise 4    Done
        //ps.grade();         // executes Exercise 5    Done
        //ps.cards();         // executes Exercise 6    Done
        //ps.leapYear();      // executes Exercise 7
        //ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an integer: ");
      int userInteger = in.nextInt();
      if(userInteger > 0){
        System.out.println("\nPositive.");
      }
      else if(userInteger < 0){
        System.out.println("\nNegative.");
      } else {
        System.out.println("\nZero.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("\nEnter an integer: ");
      int userInteger = in.nextInt();
      if(userInteger % 2 == 0){
        System.out.println("\nEven.");
      } else {
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers.");

      System.out.print("\nEnter integer: ");
      int integerOne = in.nextInt();
      System.out.print("Enter integer: ");
      int integerTwo = in.nextInt();
      System.out.print("Enter integer: ");
      int integerThree = in.nextInt();

      if (integerOne < integerTwo && integerTwo < integerThree){
        System.out.println("\nStrictly increasing.");
      } else if (integerOne <= integerTwo && integerTwo <= integerThree && (integerOne != integerTwo || integerTwo !=integerThree)){
        System.out.println("\nIncreasing.");
      } else if (integerOne == integerTwo && integerTwo == integerThree){
        System.out.println("\nSame.");
      } else if (integerOne > integerTwo && integerTwo > integerThree){
        System.out.println("\nStrictly decreasing.");
      } else if (integerOne >= integerTwo && integerTwo >= integerThree && (integerOne != integerTwo || integerTwo !=integerThree)){
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }



    }

    /*
     * Exercise 4.
     *can
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

        final double VALUE_A = 4.00;
        final double VALUE_B = 3.00;
        final double VALUE_C = 2.00;
        final double VALUE_D = 1.00;
        final double VALUE_F = 0.00;

        final double VALUE_PLUS = 0.33;
        final double VALUE_MINUS = -0.33;


        System.out.print("\nEnter a letter grade: ");
        String input = in.next();
        String letter = (String.valueOf(input.charAt(0))).toUpperCase();
        String additive = "Arbitrary Value";
        try {
            additive = String.valueOf(input.charAt(1));
        } catch (Exception e) {
            //Nothing
        }
        double gpaVar = 0;
        switch (letter) {
            case "A":
                gpaVar += VALUE_A;
                break;
            case "B":
                gpaVar += VALUE_B;
                break;
            case "C":
                gpaVar += VALUE_C;
                break;
            case "D":
                gpaVar += VALUE_D;
                break;
            case "F":
                gpaVar += VALUE_F;
                break;
            default:
                System.out.println("\nThat's not a valid letter grade.");
                break;
        }

        if (letter == "F") {
                      //Supposed to be empty. Not doing anything.
        } else if (letter == "A") {
            if (additive == "-") {
                gpaVar += VALUE_MINUS;
            }
        } else {
            switch (additive) {
                case "+":
                    gpaVar += VALUE_PLUS;
                    break;
                case "-":
                    gpaVar += VALUE_MINUS;
                    break;
                default:
                    break;
            }

        }
        System.out.printf("\nYour GPA is %.2f.\n", gpaVar);
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

      int perfect = 100;
      int gradeA = 90;
      int gradeB = 80;
      int gradeC = 70;
      int gradeD = 60;
      int failure = 0;

      System.out.print("\nEnter a grade: ");
      double grade = in.nextDouble();
      if (grade < failure){
        System.out.println("Grades below 0 are invalid.");
      } else if (grade > perfect) {
        System.out.println("Grades above 100 are invalid.");
      }
      if (grade <= perfect && grade >= gradeA){
        System.out.println("You received an A.");
      }
      if (grade < gradeA && grade >= gradeB){
        System.out.println("You received a B.");
      }
      if (grade < gradeB && grade >= gradeC){
        System.out.println("You received a C.");
      }
      if (grade < gradeC && grade >= gradeD){
        System.out.println("You received a D.");
      }
      if (grade < gradeD && grade >= failure){
        System.out.println("You received an F.");
      }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

      System.out.print("\nEnter a card: ");
        String card = in.nextLine();
        String rank = card.substring(0, 1);
        String suit = card.substring(1);
        boolean realValue = false;
        String printRank = "";
        String printSuit = "";

        switch (rank) {
          case "2":
              printRank = "Two";
              realValue = true;
              break;
          case "3":
              printRank = "Three";
              realValue = true;
              break;
          case "4":
              printRank = "Four";
              realValue = true;
              break;
          case "5":
              printRank = "Five";
              realValue = true;
              break;
          case "6":
              printRank = "Six";
              realValue = true;
              break;
          case "7":
              printRank = "Seven";
              realValue = true;
              break;
          case "8":
              printRank = "Eight";
              realValue = true;
              break;
          case "9":
              printRank = "Nine";
              realValue = true;
              break;
          case "T":
              printRank = "Ten";
              realValue = true;
              break;
          case "J":
              printRank = "Jack";
              realValue = true;
              break;
          case "Q":
              printRank = "Queen";
              realValue = true;
              break;
          case "K":
              printRank = "King";
              realValue = true;
              break;
          case "A":
              printRank = "Ace";
              realValue = true;
              break;
          default:
              System.out.println("That's not a valid rank.");
              realValue = false;
              break;
        }

        if (realValue) {
          switch (suit) {
              case "C":
                  printSuit = "Clubs";
                  realValue = true;
                  break;
              case "D":
                  printSuit = "Diamonds";
                  realValue = true;
                  break;
              case "H":
                  printSuit = "Hearts";
                  realValue = true;
                  break;
              case "S":
                  printSuit = "Spades";
                  realValue = true;
                  break;
              default:
                  System.out.println("\nThat's not a valid suit.");
                  realValue = false;
                  break;
            }
        }

        if (realValue) {
          System.out.println("\n" + printRank + " of " + printSuit + ".");
        }

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

      System.out.print("\nEnter a year: ");
        long yearInput = in.nextLong();


        if (yearInput >= 0){
            if ((yearInput % 4 == 0) && ((yearInput % 100 != 0) || (yearInput % 400 == 0))) {
                System.out.printf("\n%d is a leap year.", yearInput);
            } else {
                System.out.printf("\n%d is not a leap year.", yearInput);
            }
        }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

        final double FREEZING_POINT_CELSIUS = 0;
        final double FREEZING_POINT_FAHRENHEIT = 32;
        final double BOILING_POINT_CELSIUS = 100;
        final double BOILING_POINT_FAHRENHEIT = 212;

        System.out.print("\nEnter a temperature: ");
        double temperature = in.nextDouble();
        System.out.print("Enter a scale: ");
        String scale = (in.next()).toUpperCase();

        switch (scale) {
            case "C":
                if (temperature >= BOILING_POINT_CELSIUS) {
                    System.out.println("\nGas.");
                } else if (FREEZING_POINT_CELSIUS < temperature &&
                  temperature < BOILING_POINT_CELSIUS) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;
            case "F":
                if (temperature >= BOILING_POINT_FAHRENHEIT) {
                    System.out.println("\nGas.");
                } else if (FREEZING_POINT_FAHRENHEIT < temperature &&
                  temperature < BOILING_POINT_FAHRENHEIT) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;
            default:
                System.out.println("\nThat's not a valid scale.");
                break;
        }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
