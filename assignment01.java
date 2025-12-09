public class assignment01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Non-Primitive Data Type 
        System.out.print("Enter student name");
        String name = input.nextLine();

        // Primitive Data Types
        System.out.print("Enter marks in Math");
        int math = input.nextInt();

        System.out.print("Enter marks in Science");
        int science = input.nextInt();

        System.out.print("Enter marks in English");
        int english = input.nextInt();

        // Calculate total and average
        int total = math + science + english;        // primitive
        double average = total / 3.0;                // primitive (double)

        // Condition (if-else)
        String result; // Non-primitive (String)
        if (average >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Output
        System.out.println("\nStudent Report");
        System.out.println("Name: " + name);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}