package com.example.homework10;

import android.widget.EditText;
import android.widget.TextView;

public class task {
    private String textName;
    private String textDate;

    public task(String textName, String textDate) {
        this.textName = textName;
        this.textDate = textDate;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextDate() {
        return textDate;
    }

    public void setTextDate(String textDate) {
        this.textDate = textDate;
    }
}
