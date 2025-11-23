public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n+1];
        int i= 2;
        while (i<=n) {
            isPrime[i]= true;
            i++;
        }
        int p=2;
        while (p*p<=n) {
            int mult =p*p;
            if (isPrime[p]) {
                isPrime[mult]=false;
                mult = mult+p;
            }
            p++;
        }
        System.out.println("Prime numbers up to " +n+ ":");
        int count=0;
        int numbers=2;
        while (numbers<=n) {
            if (isPrime[numbers]) {
                System.out.println(numbers);
                count++;
            }
            numbers++;
        }
        System.out.println("There are "+count+" primes between 2 and "+n+" (" +(count*100/n)+ " are primes)");
    }
}