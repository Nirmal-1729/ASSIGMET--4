 class loop {

    public static void main(String[] args) {
        int n = 26; // number of terms to print
        char uppercase = 'A';
        char lowercase = 'b';
           
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(uppercase + " ");
                uppercase += 2;
            } else {
                System.out.print(lowercase + " ");
                lowercase += 2;
            }
        }
    }
}