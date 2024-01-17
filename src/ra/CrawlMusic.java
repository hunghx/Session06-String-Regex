package ra;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlMusic {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.24h.com.vn/the-thao-c101.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            scanner.useDelimiter("\\Z");
            String html = scanner.next();
            scanner.close();
//            html = html.replaceAll("\n","");
            Pattern pattern = Pattern.compile("' >(.*?)</a></li>");
            Matcher matcher = pattern.matcher(html);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
//            System.out.println(html);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
