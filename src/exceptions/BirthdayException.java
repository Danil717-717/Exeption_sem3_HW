package exceptions;

public class BirthdayException extends Exception{

    public void birthdayException(String i) {
        System.out.printf("Не корректная дата рождения: %s " , i + "\t  > dd.mm.yyyy");
        System.out.println();
    }
}
