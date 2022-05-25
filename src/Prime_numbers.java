public class Prime_numbers {
    public void accessnumber() {
        int prime = 1;                            //To check prime number
        for (int j = 1; j < 21; j++) {            //Initialising from 1-20
            for (int i = 2; i < j / 2; i++) {     //Condition to check prime or not
                if (j % i == 0) {
                    prime = 0;
                    break;
                } }
            if (prime != 0) {
                System.out.println(j);
            }
            j++;
        }
    }
    public static void main(String[] args) {
        Prime_numbers p=new Prime_numbers();
        p.accessnumber();
    }
}

