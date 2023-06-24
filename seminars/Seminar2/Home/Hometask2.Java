/* Задание

Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/* import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject; */

public class Hometask2 {
    public static void main(String[] args) {

        String string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] strings = string.split(", ");
        String res = strings[0].substring(1);
        strings[0] = res;
        String res2 = strings[strings.length - 1].substring(0, strings[strings.length - 1].length() - 1);
        strings[strings.length - 1] = res2;
        System.out.println(Arrays.toString(strings));


        StringBuilder newStrings = new StringBuilder("select * from students where ");

        for (String i : strings) {
            String[] val = i.split(":");
            String value = val[1];
            res = val[0].substring(1, i.split(":")[0].length() - 1);
            res2 = val[1].substring(1, i.split(":")[1].length() - 1);
            if(!value.equals("\"null\"")){
                if (!i.equals(strings[strings.length - 1])) {
                    newStrings.append(res).append(" = ").append(res2).append(" AND ");
                } else {
                    newStrings.append(res).append(" = ").append(res2);
                }
            }
        }
        int lastIndex = newStrings.lastIndexOf("AND");
        newStrings.delete(lastIndex,lastIndex+3);
        System.out.println(lastIndex);
        System.out.println(newStrings);
    }

    

}


