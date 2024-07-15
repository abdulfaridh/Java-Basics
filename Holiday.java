public class Holiday {
    private String name;
    private int day;
    private String month;

 
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    
    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

  
    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;
        for (Holiday holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

   
    public static void main(String[] args) {
       
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

       
        Holiday christmas = new Holiday("Christmas", 25, "December");
        Holiday newYear = new Holiday("New Year", 1, "January");
        Holiday laborDay = new Holiday("Labor Day", 1, "May");

        System.out.println(independenceDay.inSameMonth(christmas)); // Should print false
        System.out.println(independenceDay.inSameMonth(new Holiday("Another Holiday", 14, "July"))); // Should print true

   
        Holiday[] holidays = {independenceDay, christmas, newYear, laborDay};

        System.out.println("Average date: " + Holiday.avgDate(holidays)); // Should print the average day
    }
}
