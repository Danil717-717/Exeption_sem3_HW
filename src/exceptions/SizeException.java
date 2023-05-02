package exceptions;

public class SizeException extends Exception{
    public void sizeException(String i) {
        System.out.println("Не корректный ввод данных, внимательнее! ");
        System.out.println();
    }
}
