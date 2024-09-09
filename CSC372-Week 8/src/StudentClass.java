import java.util.Scanner;

public class StudentClass {
	
Scanner scr = new Scanner(System.in);

//Creation of private fields
private String name;
private String address;
private Double GPA;
		
//Default constructor
public StudentClass(String Name, String Address, Double GPA) {
	this.name = Name;
	this.address = Address;
	this.GPA = GPA;
}
		
//Getter & Setter	
public String getName() {
	return name;
}

public void setName(String Name) {
	this.name = Name;
}

public String getAddress() {
	return address ;
}

public void setAddress(String Address) {
	this.address = Address;
}

public double getGPA() {
	return GPA;
}

public void setGPA(double GPA) {
	this.GPA = GPA;
}

@Override
public String toString() {
    return "StudentClass;" + System.lineSeparator()
            + "name = " +this. name + ";" + System.lineSeparator()
            + "address = " + this.address + ";" + System.lineSeparator()
            + "GPA = " + this.GPA + ".";
}
}