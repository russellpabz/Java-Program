/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.stiwnu.javadictionary;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JFrame;

/**
 *
 * @author Server
 */
public class JavaDictionary {

    public static void main(String[] args) throws IOException {
        //System.out.println("Hello World!");
        
        JFrame mainFrame = new MainFrame();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

//        URL urlObj = new URL("https://api.dictionaryapi.dev/api/v2/entries/en/test");
//        HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
//        connection.setRequestMethod("GET");
//
//        int responseCode = connection.getResponseCode();
//        //System.out.println("Response CODE: " + responseCode);
//
//        if (responseCode == HttpsURLConnection.HTTP_OK) {
//            StringBuilder sb = new StringBuilder();
//            Scanner scanner = new Scanner(connection.getInputStream());
//            while (scanner.hasNext()) {
//                sb.append(scanner.nextLine());
//            }
//            //System.out.println(sb);
//            ObjectMapper objectMapper = new ObjectMapper();
//            Dictionary[] dictionary = objectMapper.readValue(String.valueOf(sb), new TypeReference<Dictionary[]>() {});
//            //System.out.println(country[0].toString());
//            System.out.println(dictionary[0]);
//        
//
//        } else {
//            System.out.println("Error in sending a GET request");
//        }
    }
}
