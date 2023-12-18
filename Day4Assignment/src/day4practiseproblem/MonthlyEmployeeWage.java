package day4practiseproblem;

public class MonthlyEmployeeWage {

	private static  int employeeRateperhr = 20;
    private static  int fullTimeHours = 8;
    private static int partTimeHours=4;
    private static  double probability = 0.5;
    private static  int workingDaysPerMonth = 20;

    
    private static boolean isPresent()
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
   
	
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Daily Employee Wage Calculation Program!");
		
		int totalWage=0;
		
		for (int day = 1; day <= workingDaysPerMonth; day++)
		{
            
            boolean isPresent = isPresent();

            if (isPresent)
            {
                System.out.println("Day " + day + ": Employee is Present");

                // This will tell if the employee is full-time, part-time, or absent
                int employeeTypeCode = (int) (Math.random() * 3); 

                // Convert the code to employee type
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
                totalWage += dailyWage;

                System.out.println("Daily Wage for an Employee on Day " + day + ": Rs " + dailyWage);
            }
		
            else
            {
            		System.out.println("Employee is Absent");
            }
    }

	}
}


