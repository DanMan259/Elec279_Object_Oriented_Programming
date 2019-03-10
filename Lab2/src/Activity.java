
public class Activity {
	private int day, month, year;
	
	public Activity() {
		day 	= 1;
		month 	= 1;
		year 	= 1;
	}
	public Activity(int d, int m, int y) {
		setDate(d, m, y);
	}
	
	//Accessor to get day
	public int getDay() {
		return day;
	}
	//Accessor to get month
	public int getMonth() {
		return month;
	}
	//Accessor to get year
	public int getYear() {
		return year;
	}
	
	//Mutator method to change the date
	public void setDate(int d, int m, int y) {
		if (y>=0) {
			year = y;
			if(m <= 12 && m > 0) {
				month = m;
				if(month == 2) {
					if(d <= 28 && d > 0) {
						day = d;
					} else {
						System.out.println("Invalid day");
						this.setDate(1, m, y);
					}
				}
				
				else if(m == 4 || m == 6 || m == 9 || m == 11) {
					if(d <= 30 && d > 0) {
						day = d;
					}
					else {
						System.out.println("Invalid day");
						this.setDate(1, m, y);
					}
				}
		
				else{
					if(d <= 31 && d > 0) {
						day = d;
					}
					else {
						System.out.println("Invalid day");
						this.setDate(1, m, y);
					}
				}
					
			} else {
			System.out.println("Invalid month");
			this.setDate(d, 1, y);
			} 
		}else {
			System.out.println("Invalid year");
			this.setDate(d, m, 1);
		}
		

	}
	public void printDate() {
		System.out.println(day + "." + month + "." + year);
	}
	
}
