package data;

import java.util.Scanner;

public class InputData {
    public String[] inputUserData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите: Фамилия Имя Отчество, Дата_рождения(dd.mm.yyyy), Номер_телефона(цифры), Пол(f/m) через пробел:\n" +
                               "(Если нет отчества введите 2 пробела)");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("ввели недостаточно данных");
            } else System.out.println("ввели лишние данные");
        }

    }

}
