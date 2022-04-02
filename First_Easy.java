public class First_Easy {
    //Write a method that sums two numbers.
    public int first_meth(int i, int j) {
        return i + j;
    }

    //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
    public int second_meth(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //Write a method that calculates the factorial of a given number.
    //Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
    //TIP: To make it more interesting, try to do it recursively.
    public int third_meth(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    //Write a method that returns the index of the first occurrence of given integer in a list.
    //Assume that the index of the first element in the list is zero.
    //If the number does not exist return -1.
    public int fourth_meth(int occ, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (occ == arr[i]) {
                return i;

            }

        }
        return -1;
    }

    //Write a method that returns the largest integer in the list.
    //You can assume that the list has at least one element.
    public int fifth_method(int[] arr) {
        int cont = arr[0];
        for (int counter : arr) {
            if (counter > cont) {
                cont = counter;
            }


        }
        return cont;


    }
    // Write a method that reverses a string.

    /*public String sixth_method (String s){
        return new StringBuilder(s).reverse().toString();
    }

     */

    public String sixth_method(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }


}
