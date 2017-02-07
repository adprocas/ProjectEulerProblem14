package projecteulerproblem14;

public class ProjectEulerProblem14 {

    public static void main(String[] args) {
        int largestCollatz = 0;
        long startingNumber = 1L;
        
        for (long x = startingNumber; x <= 1000000L; x++) {
            int collarzNumber = 1;
            long tempNumber = x;

            while (tempNumber != 1L) {
                if (tempNumber % 2 == 0) {
                    tempNumber = tempNumber / 2;
                } else {
                    tempNumber = (tempNumber * 3) + 1;
                }
                
                collarzNumber++;
            }
            
            if(largestCollatz < collarzNumber) {
                largestCollatz = collarzNumber;
                startingNumber = x;
            }
        }
        
        System.out.println(startingNumber);
    }

}
