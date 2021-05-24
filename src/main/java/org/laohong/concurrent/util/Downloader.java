package org.laohong.concurrent.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Downloader {

    public static List<String> download() {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL("https://www.hao123.com/").openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }

}
