import java.util.Scanner;


public class longtest {

    static Scanner scan = new Scanner(System.in);

        
    public static void main(String[] args) throws Exception {
        Integer();
        Numbers();
        length();
        largestNumber();
        vowel();
        own();
        letter();
        condition();
        strand();
        email();
        ATM();
      
        
    
        


    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

     

        private static void ATM() {
    }

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
        static void Integer() {
            System.out.println("1. Positive, negative, zero");
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
              if (number > 0) 
              System.out.println("POSITIVE");
              else if (number < 0)
              System.out.println("NEGATIVE");
              else 
              System.out.println("ZERO");
            }
        
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)
        static void Numbers() {
        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
            boolean isPrime = true;
            for(int i = 2; i <= lastDigit/2; i++)
{
            // condition for nonprime number
             if(lastDigit % i == 0)
            {
isPrime = false;
break;

}
             }
             if (isPrime == true)
             System.out.println("PRIME");
             else
             System.out.println("COMPOSITE");

        }

            
        
        // ==============================================================================

        // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
        static void length() {
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int stringSize= firstName.length();
        System.out.println("The number of character for firstname is: " + stringSize);
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int Stringsize= surName.length();
        System.out.println("The number of character for surname is: " + Stringsize);


        }

        // ==============================================================================

        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        static void largestNumber() {
            System.out.println("4. Largest Number");
            System.out.print("Enter first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scan.nextInt();
            System.out.print("Enter third number: ");
            int thirdNumber = scan.nextInt();
    
            if(firstNumber > secondNumber && firstNumber > thirdNumber)
            {
                System.out.println("Largest number is:" + firstNumber);
            }
            else if(secondNumber > thirdNumber)
            {
                System.out.println("Largest number is:" + secondNumber);
            }
            else 
            {
                System.out.println("Largest number is:" + thirdNumber);
            }

        }
           
            
        

        // ==============================================================================

         // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        static void vowel(){
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
        || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U')
             System.out.println("VOWEL");
             else 
             System.out.println("CONSONANT");
        }
    
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        static void own(){
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int StudentNumber = scan.nextInt();

        if (StudentNumber == 2022104645)
        System.out.println("valid");
        else
        System.out.println("invalid");
        }
    
       // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        static void letter() {
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase())
        System.out.println("valid");
        else
        System.out.println("invalid");
    }
    

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        static void condition(){
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();

     
            // If BSIT
            switch (course){
                case "BSIT":
            System.out.print("Enter your specialization (MWA or MAA): ");
            String specialization1 = scan.next();
            switch (specialization1){
                case "MWA":
                System.out.print("you are taking BSIT-MWA ");
                break;

                case "MAA":
                System.out.println("You are taking BSIT-MAA");
                break;
            }
            break;

            // If BSCS
            case "BSCS":
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            switch (specialization2){
                case "ML":
                System.out.println("You are taking BSCS-ML");
                break;

                case "DF":
                System.out.println("You are taking BSCS-DF");
                break;
            
            }
        }
}

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
        static void strand(){
        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch (strand) {
           case "STEM":
           System.out.println("valid");
           break;

           case "ICT":
           System.out.println("valid");
           break;

           case "HUMSS":
           System.out.println("valid");
           break;

           case "HOME ECONOMICS":
           System.out.println("valid");
           break;

           case "ARTS AND DESIGN":
           System.out.println("valid");
           break;

           case "TVL MARITIME":
           System.out.println("valid");
           break;

           default:
           System.out.println("invalid");
           break;
        }
        
    }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
        static void email(){
        System.out.println("10. Validate student email address ");

        System.out.println("Enter your Email Address:");
        String email = scan.next();

        if (email.contains("villena")) {
        System.out.println("valid");

        } else {
        System.out.println("invalid");
        }
        }
    }
