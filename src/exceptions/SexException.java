package exceptions;

public class SexException extends Exception{

    public void sexException(String i) {
        System.out.printf("Ошибка: Не корректно введен пол > %s", i + " (f или m)");
        System.out.println();
    }
}
