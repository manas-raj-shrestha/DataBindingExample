package com.leapfrog.databindingsample;

import android.graphics.drawable.Drawable;

/**
 * Created by Manas on 1/4/2016.
 */
public class User {
    public final String firstName;
    public final String lastName;
    public final Drawable drawable;
    public User(String firstName, String lastName, Drawable drawable) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.drawable = drawable;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
