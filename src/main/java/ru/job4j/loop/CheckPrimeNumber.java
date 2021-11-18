package ru.job4j.loop;

public class CheckPrimeNumber {
        public static boolean check(int number) {
           boolean prime = false;
            int x = 0;
            for (int i = 1; i <= number; i++) {
               if ((number % i) == 0 && number != 1) {
                   x++;
                   if (x <= 2) {
                       prime = true;
                   } else {
                       prime = false;
                       break;
                   }

               }
            }
            return prime;
        }
}
