import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Hometsk2extra1 {
    String jsonString = "[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]";
    JSONArray jsonArray = new JSONArray(jsonString);

    for(
    int i = 0;i<jsonArray.length();i++)
    {
        JSONObject jsonObject = jsonArray.getJSONObject(i);
        String surname = jsonObject.getString("фамилия");
        String mark = jsonObject.getString("оценка");
        String subject = jsonObject.getString("предмет");
        StringBuilder resultSb = new StringBuilder("Студент ")
                .append(surname)
                .append(" получил ")
                .append(mark)
                .append(" по предмету ")
                .append(subject)
                .append(".");
        System.out.println(resultSb.toString());

    }
}

