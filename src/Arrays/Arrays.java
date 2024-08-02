package Arrays;

public class Arrays {
    public static void home(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

    }

    public static void loop(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void examples(){
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);




        // Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
    public static void multi(){
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
