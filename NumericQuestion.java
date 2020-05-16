/*
File: NumericQuestion.java
Description: This adds source code to a previous answer.
Created: May 14th, 2020
Author: Yao Cisneros
email: yaoitzc7054@student.vvc.edu
*/

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
