package p3_package;

public class PolyMultiplierClass_S4
   {

      // The purpose of the program is to find the polynomial result after multiplying two smaller polynomials.
      
      // Instantiate all the variables necessary
      // Create a title
      // Take in four coefficients that represent the polynomials multiplied as inputs
      // Do the necessary calculations to find their product
      // Print the final polynomial result
      // Display an end of program
      
      // Here the global variables will be created
      // Character constants like DOUBLE_DASH will be created
      // Necessary constants will be for TWO_ENDLINES, and TITLE_WIDTH
      // Instantiate conIO --> Console_IO_Class
      
      // Create all global constants/variables
      public static final char DOUBLE_DASH = '=';
      
      public static final int TWO_ENDLINES = 2;
      public static final int TITLE_WIDTH = 21;
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            // Instantiate conIO
            Console_IO_Class conIO = new Console_IO_Class();
                        
            // Create variables for the four coefficients, and the results three coefficients
            // NO single letter variables
            int coef_A, coef_B, coef_C, coef_D, resultCoef_R, resultCoef_S, resultCoef_T;
            
            // Print a title with the title width
            // Title is Polynomial Calculator
            // Add a thick line beneath the title with the '=' character
               // Method: printString, printChars, printEndlines
            conIO.printString("Polynomial Calculator");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, DOUBLE_DASH);
            conIO.printEndlines(TWO_ENDLINES);
            
            // Print out a template of ( ax + b ) * ( cx + d )
            // Prompt for input on all four coefficients, a,b,c,d
            // Store all inputs within four separate variables
               // Method: printString, printEndline, promptforInt, printEndlines
            conIO.printString("Multiplies two polynomial expressions");
            conIO.printEndline();
            conIO.printString("in the form: ");
            conIO.printString("( ax + b ) * ( cx + d )");
            conIO.printEndlines(TWO_ENDLINES);
            coef_A = conIO.promptForInt("Enter coefficient a: ");
            coef_B = conIO.promptForInt("Enter coefficient b: ");
            coef_C = conIO.promptForInt("Enter coefficient c: ");
            coef_D = conIO.promptForInt("Enter coefficient d: ");
            conIO.printEndline();
            
            // Do the calculations
            // a * c to find the first result coefficient
            // a * d + c * b to find the second result coefficient
            // b * d to find the last result coefficient
            // Store the results as three separate coefficient variables
               // Method: multiplication and addition
            resultCoef_R = coef_A * coef_C;
            resultCoef_S = (coef_A * coef_D) + (coef_C * coef_B);
            resultCoef_T = coef_B * coef_D;
            
            // Print out the final result as a full polynomial
            // rX^2 + sX + t
               // Method: printString, printInt, printEndlines, printEndline
            conIO.printString("Result:");
            conIO.printEndline();
            
            conIO.printString("( ");
            conIO.printInt(coef_A);
            conIO.printString("x + ");
            conIO.printInt(coef_B);
            conIO.printString(" )*( ");
            conIO.printInt(coef_C);
            conIO.printString("x + ");
            conIO.printInt(coef_D);
            conIO.printString(" ) = ");
            
            conIO.printInt(resultCoef_R);
            conIO.printString("x^2 + ");
            conIO.printInt(resultCoef_S);
            conIO.printString("x + ");
            conIO.printInt(resultCoef_T);
            
            conIO.printEndlines(TWO_ENDLINES);
            
            // Display an end program
               // Method: printString
            conIO.printString("Program End");
            
         }

   }
