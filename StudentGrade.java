/**
 * StudentGrade class
 * Contains the definition for a class to hold a student name
 * and multiple grades.  The class provides methods for toString,
 * equals, and get/set for the attributes.  
 * @author Nia Jordan
 */

public class StudentGrade {

	private String name;
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double midScore;
	private double finalScore;
	
	final double finalScale = 0.40;
	final double midScale = 0.35;
	final double quizScale = 0.25;
	
	
	private double computeAverage()
	{
		double weightedQuiz1 = ( (quiz1 * 20) /100) * quizScale;
		double weightedQuiz2 = ( (quiz2 * 20) /100) * quizScale;
		double weightedQuiz3 = ( (quiz3 * 20) /100) * quizScale; 
		double weightedFinal = (finalScore/100) * finalScale;
		double weightedMid = (midScore/100) * midScale;
		return ((weightedQuiz1 + weightedQuiz2 + weightedQuiz3)/3 + weightedMid + weightedFinal) * 100;  
	}
	
	public StudentGrade(){
		name = "";
		quiz1 = 0.0;
		quiz2 = 0.0;
		quiz3 = 0.0;
		midScore = 0.0;
		finalScore = 0.0;
	}
	
	public StudentGrade(String n){
		name = n;
	}
	
	/** 
	 * toString
	 * This method overrides the Object class' toString method
	 * @return the student information as a string.  All attributes are
	 * included, plus a call to the computeAverage() method for determining
	 * class average.
	 */
	
	public String toString()
	{
		return "Name: " + name + "\nQuiz 1: " + quiz1 + "\nQuiz 2: " + quiz2 + "\nQuiz 3: " + quiz3 + "\nMidterm Exam: " + midScore + "\nFinal Exam: " + finalScore + "\nClass Average: "+ computeAverage();
	}
	
	/** 
	 * equals
	 * This method overrides the Object class' equals method
	 * @param 	student2	the student to which to compare this one
	 * @return 	true if student name is the same between this student
	 * 			and the passed in student.  false otherwise.
	 */
	
	public boolean equals(StudentGrade student2)
	{
		return this.getName().equals(student2.getName());
	}

	/**
	 * getName
	 * @return	name	the student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName
	 * @param	n	the value to set our student name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * getQuiz1
	 * @return	quiz1	the first quiz score
	 */
	public double getQuiz1() {
		return quiz1;
	}

	/**
	 * setQuiz1
	 * @param	q1	the value to set our first quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz1(double q1) {
		boolean retVal = false;
		if (q1 >=0 && q1 <=5)
		{
			quiz1 = q1;
			retVal = true;
		}
		return retVal;
	}
	
	/**
	 * getQuiz2
	 * @return	quiz2	the second quiz score
	 */
	public double getQuiz2(){
		return quiz2;
	}
	
	/**
	 * setQuiz2
	 * @param	q2	the value to set our second quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz2(double q2) {
		boolean retVal = false;
		if(q2 >= 0 && q2 <= 5) 
		{
			quiz2 = q2;
			retVal = true;
		}
		return retVal;
	}
	
	/**
	 * getQuiz3
	 * @return	quiz3	the third quiz score
	 */
	public double getQuiz3() {
		return quiz3;
	}
	
	/**
	 * setQuiz1
	 * @param	q3	the value to set our third quiz
	 * @return  true if quiz value is in the range 0-5.
	 * false if it is out of range
	 */
	public boolean setQuiz3(double q3) {
		boolean retVal = false;
		if(q3 >= 0 && q3 <= 5) 
		{
			quiz3 = q3;
			retVal = true;
		}
		
		return retVal;
	}
	
	/**
	 * getMid
	 * @return	midScore	the midterm exam score
	 */
	public double getMid() {
		return midScore;
	}
	
	/**
	 * setMid
	 * @param	m	the value to set our midterm score
	 * @return  true if midterm value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setMid(double m) {
		boolean retVal = false;
		if(m >= 0 && m <= 100) {
			midScore = m;
			retVal = true;
			
		}
		return retVal;
	}


	/**
	 * getFinal
	 * @return	finalScore	the final exam score
	 */
	public double getFinal() {
		return finalScore;
	}
	
	/**
	 * setFinal
	 * @param	f	the value to set our final score
	 * @return  true if final exam value is in the range 0-100.
	 * false if it is out of range
	 */
	public boolean setFinal(double f) {
		boolean retVal = false;
		if(f >= 0 && f <= 100) {
			finalScore = f;
			retVal = true;
		}
		return retVal;
	}
	
	
	
	
	
}
