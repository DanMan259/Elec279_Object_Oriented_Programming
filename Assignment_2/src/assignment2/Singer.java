//Daniyal Maniar
//20064993

package assignment2;

public class Singer extends Person{
	//Instance Variable
	private String debutAlbum;
	//Constructor for Date type DOB and Date type debutAlbumReleaseDate
	private Date debutAlbumReleaseDate;
	public Singer(String name, 
			Date dateOfBirth, 
			String gender, 
			String debutAlbum, 
			Date debutAlbumReleaseDate,
			double difficulty) {
		super(name, dateOfBirth, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDate);
	}
	//Constructor for string type DOB and string type debutAlbumReleaseDate
	public Singer(String name, 
			String dateString, 
			String gender, 
			String debutAlbum, 
			String debutAlbumReleaseDateString,
			double difficulty) {
		super(name, dateString, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDateString);
	}
	//Constructor for Date type DOB and string type debutAlbumReleaseDate
	public Singer(String name, 
			Date dateOfBirth, 
			String gender, 
			String debutAlbum, 
			String debutAlbumReleaseDate,
			double difficulty) {
		super(name, dateOfBirth, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDate);
	}
	//Constructor for string type DOB and Date type debutAlbumReleaseDate
	public Singer(String name, 
			String dateString, 
			String gender, 
			String debutAlbum, 
			Date debutAlbumReleaseDateString,
			double difficulty) {
		super(name, dateString, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDateString);
	}
	//Copy Constructor
	public Singer(Singer singer) {
		super(singer);
		this.debutAlbum = singer.debutAlbum;
		this.debutAlbumReleaseDate = new Date (singer.debutAlbumReleaseDate);
	}
	//Singer debutAlbum Accessors and Mutators
	public String getDebutAlbum() {
		return debutAlbum;
	}
	public void setDebutAlbum(String debutAlbum) {
		this.debutAlbum = debutAlbum;
	}
	//Singer debutAlbum Accessors and Mutators
	public Date getDebutAlbumReleaseDate() {
		return new Date (debutAlbumReleaseDate);
	}
	public void setDebutAlbumReleaseDate (Date debutAlbumReleaseDate) {
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDate);
	}
	public void setDebutAlbumReleaseDate (String debutAlbumReleaseDateString) {
		this.debutAlbumReleaseDate = new Date (debutAlbumReleaseDateString);
	}
	//Abstract Clone method
	public Singer clone() {
		return new Singer(this);
	}
	//To String function that calls parent class's toString function, and gives derived class details
	public String toString() {
		return super.toString()+"Debut Album: "+getDebutAlbum()+"\nRelease Date: "+getDebutAlbumReleaseDate().toString()+"\n";
	}
	//Abstract entityType method. Gives details about the type of derived entity
	public String entityType() {
		return "This entity is a singer!";
	}
}
