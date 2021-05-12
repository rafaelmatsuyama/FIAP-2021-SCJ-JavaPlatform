package ex03;

class FatorialLong {

    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <=40; n++){
            fatorial *= n;
            System.out.println(fatorial);
        }
    }

}
