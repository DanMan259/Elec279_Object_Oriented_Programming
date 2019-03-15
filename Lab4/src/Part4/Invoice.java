package Part4;
public class Invoice implements Comparable<Invoice>, PayAble{
	
	private String companyName;
	private Double amount;
	
	public Invoice(){
		companyName = "No Name";
		amount = 0.0;
	}
	
	public Invoice(String theName, Double theAmount){
		companyName = theName;
		if (theName == null || theAmount < 0)
        {
             System.out.println("Fatal Error creating Invoice.");
             System.exit(0);
        }
        companyName = theName;
        amount = theAmount;
	}
	
	public String getName(){
		return companyName;
	}
	
	public Double getAmount(){
		return amount;
	}
	
	public void setName(String newName){
		if (newName == null)
        {
             System.out.println("Fatal Error setting invoice name.");
             System.exit(0);
        }
       else
            companyName = newName;
	}
	
	public void setAmount(Double newAmount){
		if (newAmount < 0)
        {
             System.out.println("Fatal Error setting invoice name.");
             System.exit(0);
        }
       else
            amount = newAmount;
	}
	
	public String toString(){
		return companyName + " is owed " + amount;
	}
	public int compareTo(Invoice bill) {
    	int result = this.amount.compareTo(bill.amount);
    	if (result < 0 ){
    		return -1;
    	}else if (result > 0){
    		return 1;
    	}else {
    		return 0;
    	} 
    }
	
	public Double amountToPay() {
		return amount;
	};
	public void printPayment() {
		System.out.println("Payment information for an invoice. Company name: "+companyName+"; payment: "+amountToPay()+";");
	};

}
