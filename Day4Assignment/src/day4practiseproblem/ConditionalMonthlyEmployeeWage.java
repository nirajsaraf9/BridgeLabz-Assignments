package day4practiseproblem;

public class ConditionalMonthlyEmployeeWage {

	private static  int employeeRateperhr = 20;
    private static  int fullTimeHours = 8;
    private static int partTimeHours=4;
    private static  double probability = 0.5;
    private static  int workingDaysPerMonth = 20;
    
    private static int maxWorkingHours= 100;
    private static int maxWorkingDays = 20;

    
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
		
			int totalWage = 0;
	        int totalWorkingHours = 0;
	        int totalWorkingDays = 0;
	        
	        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays)
	        {
	        	 boolean isPresent = isPresent();
	        	
	        	 if (isPresent) 
	        	 {
	                 System.out.println("Day " + (totalWorkingDays + 1) + ": Employee is Present");
	                 
	                 int employeeTypeCode = (int) (Math.random() * 3); // 0 for full-time, 1 for part-time, 2 for absent
	                 
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
	                 totalWorkingHours += (employeeType.equals("absent")) ? 0 : fullTimeHours;

	                 System.out.println("Daily Wage for an Employee on Day " + (totalWorkingDays + 1) + ": Rs" + dailyWage);

	             }
	        	 else {
	                 System.out.println("Day " + (totalWorkingDays + 1) + ": Employee is Absent");
	             }

	             totalWorkingDays++;
	             System.out.println("Total Monthly Wage: Rs " + totalWage);
	             System.out.println("Total Working Hours: " + totalWorkingHours);
	             System.out.println("Total Working Days: " + totalWorkingDays);

	        	 }
	        }

	}


