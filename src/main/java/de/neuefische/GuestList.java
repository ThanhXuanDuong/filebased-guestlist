package de.neuefische;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GuestList {
    private List<String> guests=new ArrayList<>();

    public GuestList() {
    }
    public GuestList(List<String> guests) {
    }

    public List<String> getGuests() {
        try {
            BufferedReader br = new BufferedReader( new FileReader("guests.txt"));
            String line;
            while ( (line=br.readLine()) != null){
                guests.add(line);
                System.out.println(line);
            }
            br.close();

        } catch (IOException e){
            e.printStackTrace();
    }
        return guests;
    }

    public void setGuests(List<String> guests)  {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("guests.txt"));
            for (String guest : guests){
                    bw.write(guest);
                    bw.write("\n");
                }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Override
    public String toString() {
        return "GuestList{" +
                "guests=" + guests +
                '}';
    }

    public void addGuest(String guest){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("guests.txt",true));
            bw.write(guest);
            bw.write("\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



