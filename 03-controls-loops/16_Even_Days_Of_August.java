/* 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August. */

class EvenDaysOfAugust {
    public static void main(String[] args) {
        int TotalDays = 31;
        int count = 0;
        int i = 1;
        while (i <= TotalDays) {
            if (i % 2 ==0) {
                count++;
            }

            i++;
        }
        System.out.println("Even days of August month: " + count);
    }
}
