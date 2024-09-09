import java.util.Comparator;

public class NameComparator implements Comparator<StudentClass>{

	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		StudentClass st1=(StudentClass)o1;  
		StudentClass st2=(StudentClass)o2;    
		return st1.getName().compareTo(st2.getName());
	}
}
