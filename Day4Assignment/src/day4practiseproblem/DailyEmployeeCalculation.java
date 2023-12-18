package day4practiseproblem;

public class DailyEmployeeCalculation {

	private static  int employeeRateperhr = 20;
    private static  int fullTimeHours = 8;
    private static int partTimeHours=4;
    private static  double probability = 0.5;
    
    private static int computeDailyWage(boolean isFullTime)
    {
        int hours = isFullTime ? fullTimeHours : partTimeHours;
        return employeeRateperhr * hours;
    }
    
    private static boolean isEmployeePresent()
    {
        return Math.random() >= probability;
    }
    
    
    private static int computeDailyWage() 
    {
        return employeeRateperhr * fullTimeHours;
    }
    
    private static int computePartDailyWage(boolean isFullTime) 
    {
		// TODO Auto-generated method stub
    	return employeeRateperhr * partTimeHours;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Daily Employee Wage Calculation Program!");
		boolean isPresent = isEmployeePresent();
		
		if (isPresent) 
		{
            System.out.println("Employee is Present");
           boolean isFullTime = Math.random()>=0.5;
            int dailyWage = computeDailyWage(isFullTime);
            System.out.println("Daily Wage for an Employee: Rs" + dailyWage);
            if(isPresent)
            {
            	System.out.println("Employee is Present");
                boolean isPartTime = Math.random()<0.5;
                int partdailyWage = computePartDailyWage(isFullTime);
                System.out.println("Daily Wage for an Employee: Rs" + partdailyWage);
            }
            
        }
		else
		{
            System.out.println("Employee is Absent");
        }
    }

	

	}


