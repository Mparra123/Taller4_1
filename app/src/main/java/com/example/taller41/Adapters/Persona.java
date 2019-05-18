package com.example.taller41.Adapters;

public class Persona {

   public String name;
   public String lastName;
   public String Email;

    public Persona(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
