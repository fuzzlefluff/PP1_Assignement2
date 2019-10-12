//Matthew Prindle Section C
import javax.swing.JOptionPane;
public class Assignment2Q1 {
	
public static void main(String[] args){
	 int day;
	 int month;
	 int year;
	 int nextaniv;
	 //these are used as a test, to make the program terminate if one of our error checks go through
	 int otherpath = 0;
	 int error= 0;
	 
	 //State the current date and ask for input
	JOptionPane.showMessageDialog(null, "For the purposes of this program, today's date is 3/2/2011");
	year = Integer.parseInt(JOptionPane.showInputDialog(null, "what year did you get married in?"));
	month = Integer.parseInt(JOptionPane.showInputDialog(null, "what month did you get married in?"));
	day = Integer.parseInt(JOptionPane.showInputDialog(null, "what day did you get married in?"));
	
	
	//checking to see if the days, month and years are valid
	if (year > 2011){
		JOptionPane.showMessageDialog(null, "You aren't married yet!");
		error= 1;}
	if (month > 12){
		JOptionPane.showMessageDialog(null, "That is not a real month!");
		error= 1;}
	if (day > 31){
		JOptionPane.showMessageDialog(null, "There aren't that many days in a month!");
		error= 1;}
	if (month == 2 & day > 29){
		JOptionPane.showMessageDialog(null, "There aren't that many days in Feburary!");
		error= 1;}
	if (month == 4 |month == 6 |month == 9 | month == 11 & day >30){
		JOptionPane.showMessageDialog(null, "The month you entered doesn't have 31 days");
		error= 1;}
	
	
	//if all the dates are valid, then we begin calculating
	if (error == 0)
	{
		//check to see if the date occurs before 3/2 or 3/3 requiring an algorithm adjustment
		if ( month <= 3)
		{
					if (day == 2)
						{
							//the anniversary is today
							nextaniv = 2011- year;
							JOptionPane.showMessageDialog(null, "Today is your anniversary! \n Your anniversary number is: " + nextaniv);
							otherpath = 1;
						}
					if (month == 3 & day >= 3)
						{
								//the anniversary is in march, but after today's date
								nextaniv = 2011 - year;
								JOptionPane.showMessageDialog(null, "You entered: " +month+"/"+day+"/"+year + " as your wedding date \n Your anniversary number is: " + nextaniv);
								otherpath = 1;
						}
			else
			{
					if( otherpath == 0)
					{
								//the anniversary is next year
								nextaniv = 2011 - year;
								//increment to take into account the anniversary is next year
								++nextaniv;
								JOptionPane.showMessageDialog(null, "You entered: " +month+"/"+day+"/"+year + " as your wedding date \n Your anniversary number is: " + nextaniv);
					}
			}		
		}
		
		//if no special conditions arise, we do the basic calculation
		else
		{
			if (month > 3)
				{
					nextaniv = 2011- year;
					JOptionPane.showMessageDialog(null, "You entered: " +month+"/"+day+"/"+year + " as your wedding date \n Your anniversary number is: " + nextaniv);
				}
		}
	}
	
}
}