package de.neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        List<String> guests=new ArrayList<>(Arrays.asList(
                "Thanh",
                "Tobi" ,
                "Fra"));
        GuestList guestList=new GuestList(new ArrayList<>());

        guestList.setGuests(guests);
        System.out.println(guestList.getGuests());
    }
}