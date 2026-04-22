import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner console = new Scanner(System.in); 
        double highest = 0; 
        double lowest = Double.MAX_VALUE; 
        double average = 0; 
        int count = 0; 

        while (console.hasNextDouble()) {
            double temp = console.nextDouble(); 
            if (temp > highest) highest = temp;
            else if (temp < lowest) lowest = temp;
            
            average += temp;
            count ++; 
        }

        average /= count; 

        System.out.println("Lowest Temperature: " + Math.round(lowest * 100) / 100.0); 
        System.out.println("Highest Temperature: " + Math.round(highest * 100) / 100.0); 
        System.out.println("Average temperature: " + Math.round(average * 100) / 100.0); 
        console.close(); 
    }
}
