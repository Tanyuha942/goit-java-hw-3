public class ATM {

    public int countBanknotes(int sum) {
        int counter = 0;
        int[] bancnots = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (i < bancnots.length) {
            if (sum/bancnots[i] == 0) {
                i++;
            }
           else if (sum / bancnots[i] != 0) {
               counter += 1;
//               System.out.println(sum / bancnots[i] + " - sum = " + sum + " = " + bancnots[i]);
               sum = sum - bancnots[i];
           }
           else if (sum/bancnots[i] == 1 && (sum - bancnots[i]) != 0) {
//                System.out.println("bancnots[i] = " + (sum - bancnots[i]));
                sum = sum - bancnots[i];
               i++;
            }
            else if (sum == 1){
                counter += 1;
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(57)); //578
    }
}