import java.util.Scanner

public class Question
{
	text="";
	answer="";
	
	
}
public static void presentQuestion(Question q)
{
	q.display();
	System.out.print("Your answer: ")
	Scanner in =new Scanner(System.in);
	String response =in.nextLine();
	System.out.println(q.checkAnswer(response));
}

public void setText(String questionText)
{
	text=questionText;
}

public void setAnswer (String correctResponse)
{
	answer=correctResponse;
}

public boolean checkAnswer(String response)
{
	return response.replaceAll("\\s+","").toLowerCase());
}