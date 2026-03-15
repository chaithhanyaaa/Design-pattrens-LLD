// Step 1: Define the Functional Interface
// (Even before the annotation existed, this was just an interface with one method)
interface SalaryCalculator {
    double calculate(double base, double bonus);
}

public class LegacyWay {
    public static void main(String[] args) {
        
        /* * Step 2: The "Old Way" (Anonymous Inner Class)
         * We are defining the logic AND creating the object at the same time.
         * Notice how much "noise" (boilerplate) there is just to add two numbers.
         */
        SalaryCalculator sdeSalary = new SalaryCalculator() {
            @Override
            public double calculate(double base, double bonus) {
                // This is the only line of code that actually MATTERS
                return base + bonus;
            }
        };

        // Step 3: Using the object
        double totalSalary = sdeSalary.calculate(500000, 100000); // Example: 6 LPA
        System.out.println("Total Salary: " + totalSalary);
        
        /*
         * Note for your GitHub: 
         * Every time we used 'new SalaryCalculator() { ... }', 
         * the compiler generated a separate .class file like 'LegacyWay$1.class'.
         */
    }
}