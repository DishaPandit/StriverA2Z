/*
https://www.geeksforgeeks.org/problems/count-digits5716/1

TC - O(log10 n)
SC - O(1)

 */
package basicmaths;
class CountDigits{
    static int evenlyDivides(int n) {
        // code here

        int num = n;
        int count = 0;
        while(num>0){
            int digit = num%10;
            if(digit != 0 && n % digit == 0)
                count++;
            num = num/10;
        }
        return count;
    }
}

/*
Method 2

TC - O(1)
SC - O(1)

    static int countDigits(int n) {
        // Initialize a variable 'cnt' to
        // store the count of digits.
        int cnt = (int) (Math.log10(n) + 1);

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return cnt;
    }

*/