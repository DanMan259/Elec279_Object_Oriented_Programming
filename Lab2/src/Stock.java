
public class Stock {
	private int day, month, year;
	private int[] values = new int[7];
	private String name;
	
	public Stock() {
		day = 1;
		month = 1;
		year = 1;
		
		name = "";
		
		for(int i = 0; i < 7; i++) {
			values[i] = 0;
		}
	}
	
	public Stock(int d, int m, int y, String n, int[] v) {
		this.setDate(d, m, y);
		name = n;
		if(v.length == 7) {
			for(int i = 0; i < v.length ; i++) {
				values[i] = v[i];
			}
		}
		
		else {
			System.out.println("invalid date");
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue(int i) {
		if(i > 0 && i < 7) {
			return values[i];
		}
		else {
			System.out.println("invalid index");
			return 0;
		}
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setValue(int v, int i) {
		if(i > 0 && i < 7) {
			if(v >0) {
			values[i] = v;
			}
			else {
				System.out.println("invalid v");
			}
		}
		else {
			System.out.println("invalid i");
		}
	}
	
	public void printStock() {
		System.out.print(name + " - ");
		for(int i = 0; i< 7; i++) {
			System.out.print(values[i] + ", ");
		}
		this.printDate();
	}
	
	public int getMeanValue() {
		int m = 0;
		for(int i = 0; i < 7; i++) {
			m += values[i];
		}
		m = m/7;
		return m;
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
