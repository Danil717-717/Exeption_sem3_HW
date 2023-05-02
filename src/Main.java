import data.ParseData;
import data.WriteData;
import exceptions.SizeException;

import java.io.IOException;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        ParseData parsData = new ParseData();
        WriteData writeFile = new WriteData();

        LinkedHashMap<String, String> data = parsData.parsData();
        while (data.size() != 6) {
            try {
                throw new SizeException();
            } catch (SizeException e) {
                data = parsData.parsData();
            }
        }

        String newFileName = data.get("Фамилия") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append("<");
            sb.append(data.get(str));
            sb.append(">");
        }

        System.out.println(data);
        System.out.println(newFileName);
        writeFile.writeData(String.valueOf(sb), newFileName);
    }




}
