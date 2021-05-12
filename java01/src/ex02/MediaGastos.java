package ex02;

class MediaGastos {

    public static void main(String[] args) {

        int gastosP1 = 15000;
        int gastosP2 = 23000,
            gastosP3 = 17000;
        int gastosTotal = gastosP1 + gastosP2 + gastosP3;
        int media = gastosTotal / 3;

        System.out.println("Total de gastos  = " + gastosTotal);
        System.out.println("Média de gastos  = " + media);
    }

}

