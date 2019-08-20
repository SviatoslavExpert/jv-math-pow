package core.basesyntax;

public class CustomMathPow {

    /**
     * Написать метод pow(int number, int exponential), который является аналогом метода
     * Math.pow() и принимает 2 целых числа:
     * number - число которое надо возводить в какую-то степень
     * exponential - значение степени
     */
    public int pow(int number, int exponential) {
        if (exponential == 0) {
            return 1;
        }
        int calculationResult = number;
        for (int i = 1; i < exponential; i++) {
            calculationResult *= number;
        }
        return calculationResult;
    }
}
