package day4practiseproblem;

public class EmployeeAttendance {
	
	private static final float presentProbability=0.5f;
	
	private static boolean isPresent() {
        return Math.random() >= presentProbability;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Attendance Check Program!");

        // Check if the employee is present or absent
        if (isPresent()) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

	}

}
