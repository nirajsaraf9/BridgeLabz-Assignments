package day4practiseproblem;

public class DailyEmployeeWage {

	private static  int employeeRateperhr = 20;
    private static  int fullTimeHours = 8;
    private static  double probability = 0.5;
    
    private static  boolean isEmployeePresent() {
        return Math.random() >= probability;
    }
    
    private static int computeDailyWage() {
        return employeeRateperhr * fullTimeHours;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Daily Employee Wage Calculation Program!");
		boolean isPresent = isEmployeePresent();
		
		if (isPresent) 
		{
            System.out.println("Employee is Present");
           
            int dailyWage = computeDailyWage();
            System.out.println("Daily Wage for an Employee: Rs" + dailyWage);
        }
		else
		{
            System.out.println("Employee is Absent");
        }
    }

	}


