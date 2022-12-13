package calculator;

import javax.swing.JOptionPane;

public class Student implements Iscore {
	
    private double score; // Creating a variable of the student's score
  
    // Method getter e setter
	public double getScore() {
		return score;
	}
	protected void setScore(double score) {
		this.score = score;
	}
	
	// Method to insert the student's score through the JOptionPane library
	public void insertScore() {
		setScore(Double.parseDouble(JOptionPane.showInputDialog("Enter the student's score:\n(Value must be 1 to 10)")));
		JOptionPane.showMessageDialog(null, "Score computed!\nValue: "+getScore());
	}
	
	// Method to show the user if he passed or failed, with 3 condition structures + JOptionPane library to show the results
	public void showScore() {
		if(getScore()==10) {
			JOptionPane.showMessageDialog(null, "Congratulations, you have achieved all the assessment indicators with excellence!");
		} else if(getScore()>=7 ) {
			JOptionPane.showMessageDialog(null, "Congratulations, you have achieved satisfactory performance on the assessment indicators!");
		} else {
			JOptionPane.showMessageDialog(null, "You didn't achieve the minimum expected for approval!");
		}
		
	}
	
}
