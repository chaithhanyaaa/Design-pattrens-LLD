// We use the same interface from the Legacy file
@FunctionalInterface
interface SalaryCalculator {
    double calculate(double base, double bonus);
}

public class ModernWay {
    public static void main(String[] args) {
        
        /* * The "Lambda Way"
         * We removed: 'new SalaryCalculator()', '@Override', and the method name.
         * Java "infers" the rest because it's a Functional Interface.
         */
        SalaryCalculator sdeSalary = (base, bonus) -> base + bonus;

        // Calling the method is exactly the same
        double totalSalary = sdeSalary.calculate(500000, 100000); 
        System.out.println("Total SDE Salary: " + totalSalary);

        /*
         * Pro-Tip for your GitHub:
         * If you have multiple lines of logic, use curly braces:
         */
        SalaryCalculator seniorSdeSalary = (base, bonus) -> {
            double tax = 0.10 * base;
            return (base - tax) + bonus;
        };
        
        System.out.println("Net Salary after tax: " + seniorSdeSalary.calculate(500000, 100000));
    }
}