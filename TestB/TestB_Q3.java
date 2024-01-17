package TestB;

public class TestB_Q3 {
    public class CartonBoxCalculator {

        public static void main(String[] args) {
            // Hypothetical product dimensions (length, width, height in mm)
            int productLength = 100;
            int productWidth = 50;
            int productHeight = 50;
    
            // Carton box dimensions from the sample data (length, width, height in mm)
            int boxLength = 320;
            int boxWidth = 260;
            int boxHeight = 200;
    
            int maxQuantity = calculateMaxQuantity(productLength, productWidth, productHeight, boxLength, boxWidth, boxHeight);
            System.out.println("Maximum quantity of product that can be shipped: " + maxQuantity);
        }
    
        public static int calculateMaxQuantity(int productLength, int productWidth, int productHeight, int boxLength, int boxWidth, int boxHeight) {
            // Calculate the number of products that fit in each dimension
            int lengthFit = boxLength / productLength;
            int widthFit = boxWidth / productWidth;
            int heightFit = boxHeight / productHeight;
    
            // Calculate the maximum quantity of products that can fit in the carton box
            return lengthFit * widthFit * heightFit;
        }
    }
    
}
