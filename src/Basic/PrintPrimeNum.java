package Basic;
// WAP to print all prime number till 50
public class PrintPrimeNum {
    public static void main(String[] args) {
        int n = 60;
        for(int i = 2; i<= n; i++){
            int flag = 0;
            for(int j =2; j<= i/2; j++){
                if(i%j==0)
                {
                     flag =1;
                    break;
                }
            }
            if(flag==0)
            System.out.println("Prime Numbers are:" + i);
        }
    }
}
/*
         * 1. Start from 2 till N using for loop. will store this range on (i)
         * 2. We have to check by dividing every number starts from 2 till (i/2) -->
         * using j
         */
