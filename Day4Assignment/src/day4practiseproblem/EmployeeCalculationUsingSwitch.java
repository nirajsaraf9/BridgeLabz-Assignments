package day4practiseproblem;

public class EmployeeCalculationUsingSwitch {

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
    
    private static int computeDailyWage(String employeeType)
    {
        int hours;
        switch (employeeType) {
            case "full-time":
                hours = fullTimeHours;
                break;
            case "part-time":
                hours = partTimeHours;
                break;
            default:
                hours = 0; // Absent
        }
        return employeeRateperhr * hours;
    }
   
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Daily Employee Wage Calculation Program!");
		boolean isPresent = isEmployeePresent();
		
		if (isPresent) 
		{
            System.out.println("Employee is Present");
            int employeeTypeCode = (int) (Math.random() * 3);
            
            String employeeType;
            switch (employeeTypeCode) 
            {
                case 0:
                    employeeType = "full-time";
                    break;
                case 1:
                    employeeType = "part-time";
                    break;
                default:
                    employeeType = "absent";
            }
            int dailyWage = computeDailyWage(employeeType);
            System.out.println("Daily Wage for an Employee: Rs " + dailyWage);
            
            
        }
		else
		{
            System.out.println("Employee is Absent");
        }
    }

	

	}


