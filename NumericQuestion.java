public class NumericQuestion extends Question
{
	private double answer;
	
	public void setAnswer(double correctResponse)
	{
		answer = correctResponse;
		}
		
		public boolean checkAnswer(String response)
		{
		double responseDouble = Double.parseDouble(response)
		return Math.abs(responseDouble - answer) <= 0.01;
		}
		
}