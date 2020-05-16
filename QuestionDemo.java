import java.util.ArrayList;
import java.util.Scanner;



public class QuestionDemo
{
  public static void main(String[] args)
  {
    Question q = new Question();
    q.setText("Who was the inventor of Java?");
    q.setAnswer("James Gosling");
    presentQuestion(q);
  };

  public static void presentQuestion(Question q)

  {
    q.display();
    System.out.print("Your answer: ");
    Scanner in = new Scanner(System.in);
    String response = in.nextLine();
    System.out.println(q.checkAnswer(response));
  }
}