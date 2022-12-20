import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.text.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    System.out.println(" \n NBA Multiple Choice Quiz");
    System.out.println(" \n Please enter ONLY letter of the answer you are choosing");

    //Scanner
    Scanner myScan= new Scanner(System.in);

    //Decimal Formatter
    DecimalFormat formatter= new DecimalFormat ("#0.0");

    //Variables
    final String q1Answer = ("D");
    final String q1Answer2 = ("d");
    final String q2Answer = ("B");
    final String q2Answer2 = ("b");
    final String q3Answer = ("D");
    final String q3Answer2 = ("d");
    final String q4Answer = ("C");
    final String q4Answer2 = ("c");
    final String q5Answer = ("A");
    final String q5Answer2 = ("a");
    String userAnswer;
    double score = 0;
    int scoreWrong = 0;
    double percentage;

    //Create A Random Number to choose which quiz
    Random random = new Random();
    int rand = 0;
    while (true)
    {
    rand = random.nextInt(3);
    if(rand !=0) break;
    }

    //First Quiz

    if (rand==1) 
    {
      //Asking Question 1
      System.out.println(" \n What team won the very first NBA game?");
      System.out.println(" \n (A) Chicago Stags \n (B) Philadelphia Warriors \n (C) Toronto Huskies \n (D) New York Knicks \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(q1Answer) || userAnswer.equals(q1Answer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }
        
      
      // Asking Question 2
      System.out.println(" \n Who scored the first three-point basket in NBA history?");
      System.out.println(" \n (A) Wes Unseld \n (B) Chris Ford \n (C) Gene Stump \n (D) Larry Bird \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(q2Answer) || userAnswer.equals(q2Answer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }

      
      // Asking Question 3
      System.out.println(" \n Which Toronto Raptors head coach was fired the same year that he was named NBA Coach?");
      System.out.println(" \n (A) Butch Carter \n (B) Lenny Wilkens \n (C) Sam Mitchell \n (D) Dwane Casey \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(q3Answer) || userAnswer.equals(q3Answer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }

      
      // Asking Question 4
      System.out.println(" \n What are the Dallas Mavericks names after?");
      System.out.println(" \n (A) Broadway Musical \n (B) Short Story \n (C) TV Show \n (D) Novel \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(q4Answer) || userAnswer.equals(q4Answer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }


      // Asking Question 5
      System.out.println(" \n Who is the oldest player to score 50+ points in a game?");
      System.out.println(" \n (A) Jamal Crawford \n (B) Grant Hill \n (C) Micheal Jordan \n (D) Steve Nash \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(q5Answer) || userAnswer.equals(q5Answer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }
    }

    // Second Quiz 

    if (rand==2) 
    {
      //Variables
      final String firstAnswer = ("C");
      final String firstAnswer2 = ("c");
      final String secondAnswer = ("D");
      final String secondAnswer2 = ("d");
      final String thirdAnswer = ("B");
      final String thirdAnswer2 = ("b");
      final String fourthAnswer = ("B");
      final String fourthAnswer2 = ("b");
      final String fifthAnswer = ("A");
      final String fifthAnswer2 = ("a");

      //Asking Question 1
      System.out.println(" \n How old was the oldest player ever drafted by an NBA team?");
      System.out.println(" \n (A) 29 \n (B) 25 \n (C) 27 \n (D) 23 \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(firstAnswer) || userAnswer.equals(firstAnswer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }
        
      
      // Asking Question 2
      System.out.println(" \n Who was the first Toronto Raptor to score 50 points in a playoff game?");
      System.out.println(" \n (A) Demar Derozan \n (B) Kyle Lowry \n (C) Kawhi Leonard \n (D) Vince Carter \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(secondAnswer) || userAnswer.equals(secondAnswer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }

      
      // Asking Question 3
      System.out.println(" \n What NBA player has won the most league MVP's?");
      System.out.println(" \n (A) Stephen Curry \n (B) Kareem Abdul-Jabbar \n (C) Micheal Jordan \n (D) Lebron James \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(thirdAnswer) || userAnswer.equals(thirdAnswer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }

      
      // Asking Question 4
      System.out.println(" \n How many points did LeBron James score in his first NBA game?");
      System.out.println(" \n (A) 61 \n (B) 25 \n (C) 19 \n (D) 41 \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(fourthAnswer) || userAnswer.equals(fourthAnswer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }


      // Asking Question 5
      System.out.println(" \n Who was the shortest player in NBA history?");
      System.out.println(" \n (A) Muggsy Bogues \n (B) Manute Bol \n (C) Micheal Jordan \n (D) Steve Nash \n ");
      userAnswer = myScan.nextLine();
        
        //Check Answer 
        if (userAnswer.equals(fifthAnswer) || userAnswer.equals(fifthAnswer2)) 
        {
          System.out.println(" \n Correct!");
          score++;
        }
        else 
        {
          System.out.println(" \n Incorrect!");
          scoreWrong++;
        }
    }


    //Ending Totals and Percentage
    System.out.println(" \n You have completed the quiz!");
    System.out.println(" \n You got " + scoreWrong + " questions incorrect");
    System.out.println(" \n You got " + score + " questions correct");

    //Percentage and Rounding
    percentage = (score/5)*100;
    String percentageRounded = formatter.format(percentage);

    //Output based on what percentage they got
    if (percentage > 80.0)
    {
      System.out.println(" \n Congratulations! You got a %" + percentageRounded + " on this quiz!");
    }
    else if (percentage > 60.0)
    {
      System.out.println(" \n Good Job! You got a %" + percentageRounded + " on this quiz!");
    }
    else if (percentage > 50.0)
    {
      System.out.println(" \n Maybe you can try again! You got a %" + percentageRounded + " on this quiz.");
    }
    else if (percentage < 50.0)
    {
      System.out.println(" \n Oh no, you failed! You got a %" + percentageRounded + " on this quiz.");
    }


  }
}