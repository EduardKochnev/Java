public class HomeWorkApp {

    public static void main(String[] args) {
            printThreeWords();
            checkSumSign(1,1);
            printColor(101);
            compareNumbers(5,2);
        }

        static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        static void checkSumSign(int a, int b) {
            int sum = a + b;
                if (sum >= 0) {
                    System.out.println("Сумма положительная");
                        }else {
                            System.out.println("Сумма отрицательная");
                }
        }

        static void printColor(int value){
            if (value <= 0){
                System.out.println("Красный");
                    }else if (value > 0 && value <= 100) {
                        System.out.println("Жёлтый");
                            }else if (value > 100){
                                System.out.println("Зелёный");
                    }
        }

        static void compareNumbers(int a, int b){
            if (a >= b){
                System.out.println(a + " >= " + b);
                    } else {
                        System.out.println(a + " < " + b);
                }

            }
    }

