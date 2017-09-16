import java.util.Date;
import java.util.*

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
    scanner s=new Scanner(system.in());
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	    return students;
	}

	@Override
	public void setStudents(Student[] students){
	    this.students[0]=students[0]
	    this.students[1]=students[1]
	    this.students[2]=students[2]

	    for(i=0;i<=Student;i++)
        Student[i]=s.nextInt()

	}


	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	public void addFirst(Student student) {
		// Add your implementation here
	}

	public void addLast(Student student) {
		// Add your implementation here
	}


	public void add(Student student, int index) {
		// Add your implementation here

	public void remove(int index) {
		// Add your implementation here
	}

	public void remove(Student student) {
		// Add your implementation here
	}
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	public void removeFromElement(Student student) {
		// Add your implementation here

	public void removeToIndex(int index) {
		// Add your implementation here
	}


	public void removeToElement(Student student) {
		// Add your implementation here

	public void bubbleSort() {
		// Add your implementation here
	}
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;

	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
