package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GuestListTest {
    @Test
    void shouldBeEmptyInitially(){
        // Given
        GuestList guestList=new GuestList();
        List<String> guests=new ArrayList<>();
        guestList.setGuests(guests);
        //When
        List<String> actual= guestList.getGuests();
        //Then
        Assertions.assertEquals(new ArrayList<>(),actual);
    }
    @Test
    void shouldReadSameGuestsAsWrittenBefore(){
        // Given
        GuestList guestList=new GuestList();
        List<String> guests=new ArrayList<>(Arrays.asList(
                "Karl",
                "Ute" ));
        guestList.setGuests(guests);
        //When
        List<String> actual= guestList.getGuests();
        //Then
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(
                "Karl",
                "Ute" )),actual);
    }

    @Test
    void shouldWriteToFileSystem() {
        // Given
        GuestList guestList=new GuestList();
        List<String> guests=new ArrayList<>(Arrays.asList(
                "Theodor",
                "Anette" ));
        guestList.setGuests(guests);

        //Then
        List<String> actual=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader( new FileReader("guests.txt"));
            String line;
            while ( (line=br.readLine()) != null){
                actual.add(line);
            }
            br.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(
                "Theodor",
                "Anette" )),actual);

    }


    @Test
    void shouldReadToFileSystem() {
        // Given
        GuestList guestList=new GuestList();
        List<String> guests=new ArrayList<>(Arrays.asList(
                "Stephan",
                "Max" ));
        guestList.setGuests(guests);
        //Then
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(
                "Stephan",
                "Max" )),guestList.getGuests());
    }

    @Test
    void shouldWriteAddedGuestToFileSystem() {
        // Given
        GuestList guestList=new GuestList();
        List<String> guests=new ArrayList<>(Arrays.asList(
                "Theodor",
                "Anette" ));
        guestList.setGuests(guests);

        //Then
        List<String> actual=new ArrayList<>();
        guestList.addGuest("Max");
        try {
            BufferedReader br = new BufferedReader( new FileReader("guests.txt"));
            String line;
            while ( (line=br.readLine()) != null){
                actual.add(line);
            }
            br.close();
        } catch  (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(
                "Theodor",
                "Anette" ,
                "Max")),actual);

    }

}