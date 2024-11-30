public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean [] arrNums1 = new boolean[num+1];
        int countP = 0;

        for (int i=2; i<arrNums1.length; i++) {
            arrNums1 [i] = true;
        }
       
         for (int i=2; i*i <=num; i++) {
            if (arrNums1[i]) {
                for (int j = i * i; j <= num; j += i) {
                    arrNums1[j] = false;
                }
            }
         }
        for (int l=2; l <= num; l++){
            if ((boolean)arrNums1[l] == true) {
                countP++;
            }
        }
       
        double pre = (double)countP/num*100;
        System.out.println ("There are "+countP+" primes between 2 and "+num+" ("+(int)pre+"% are primes)"); 
    }
}
