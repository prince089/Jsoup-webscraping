/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import org.jsoup.*;
import org.json.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author princ
 */
public class Wbscrap {
    public static String getnews() throws IOException, JSONException{
//        Document doc = Jsoup.connect("https://www.msn.com/de-de").get();
        Document doc = Jsoup.connect("https://indianexpress.com/").get();
        String temp = "{\n" +
"	\"name\": \"John\",\n" +
"	\"age\": 30,\n" +
"	\"car\": null\n" +
"}";
        Elements element = doc.getElementsByTag("a");
        
        JSONObject result = new JSONObject();
        int count = 0;
//        String title = "{\n" +
//"	\"name\": \"John\",\n" +
//"	\"age\": 30,\n" +
//"	\"car\": null\n" +
//"}";
//String title = doc.toString();
        for(Element t:element ){
//            System.out.println(t.text().toString() + "print");
//             title =t.select("a").attr("href");
            result.append("IE"+count++,t.text());
            
        }
        return result.toString();
    }
}
