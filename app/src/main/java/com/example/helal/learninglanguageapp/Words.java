package com.example.helal.learninglanguageapp;

import android.widget.ArrayAdapter;

/**
 * Created by Helal on 11/27/2017.
 */

public class Words  {
    private String Frinsh , English;

    public Words(String frinsh, String english) {
        Frinsh = frinsh;
        English = english;
    }

    public String getFrinsh() {
        return Frinsh;
    }

    public void setFrinsh(String frinsh) {
        Frinsh = frinsh;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }
}
