import exceptions.BirthdayException;
import exceptions.PhoneNumException;
import exceptions.SexException;

import java.util.LinkedHashMap;

public class ParseData {

    public LinkedHashMap<String, String> parsData() {
        InputData inputData = new InputData();
        String[] arrData = {"Фамилия", "Имя", "Отчество", "Дата_рождения", "Номер_телефона", "Пол"};
        String[] data = inputData.enterData();

        LinkedHashMap<String, String> dataDic = new LinkedHashMap<>();
        String[] userName = new String[3];
        System.arraycopy(data, 0, userName, 0, 3);
        dataDic.put(arrData[0], userName[0]);
        dataDic.put(arrData[1], userName[1]);
        dataDic.put(arrData[2], userName[2]);

        String[] birthday = new String[1];
        System.arraycopy(data, 3, birthday, 0, 1);
        String birthdayPars = birthday[0];
        String[] dd = birthdayPars.split("\\.");
        if (Integer.parseInt(dd[0]) < 0 || Integer.parseInt(dd[0]) > 31 ||
                Integer.parseInt(dd[1]) < 0 || Integer.parseInt(dd[1]) > 12 ||
                Integer.parseInt(dd[2]) < 1900 || Integer.parseInt(dd[2]) > 2023) {
            try {
                throw new BirthdayException();
            } catch (BirthdayException e) {
                e.birthdayException(birthdayPars);
            }
        } else {
            dataDic.put(arrData[3], birthday[0]);
        }

        String[] number = new String[1];
        System.arraycopy(data, 4, number, 0, 1);
        if(number[0].matches("[0-9]+")){
            dataDic.put(arrData[4], number[0]);
        }else {
            try {
                throw new PhoneNumException();
            }catch (PhoneNumException e) {
                e.phoneNumException();
            }
        }

        String[] sex = new String[1];
        System.arraycopy(data, 5, sex, 0, 1);
        String s = sex[0];
        int lentghS = s.length();
        if (lentghS == 1) {
            if (s.equals("f") || s.equals("m")) {
                dataDic.put(arrData[5], sex[0]);
            } else {
                try {
                    throw new SexException();
                } catch (SexException a) {
                    a.sexException(s);
                }
            }
        } else {
            try {
                throw new SexException();
            } catch (SexException b) {
                b.sexException(s);
            }
        }

        return dataDic;
        }

}
