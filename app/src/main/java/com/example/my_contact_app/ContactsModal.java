package com.example.my_contact_app;

public class ContactsModal {

    // variables for our user name
    // and contact number.
    private String contactID;
    private String userName;
    private String contactNumber;

    // constructor
    public ContactsModal(String userName, String contactNumber, String contactID) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.contactID = contactID;
    }

    // on below line we have
    // created getter and setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }
}

