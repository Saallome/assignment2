package assignment2.organizations.travelagency;

import assignment2.commons.Organization;
import assignment2.commons.Contactable;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency extends Organization implements Contactable {
    String email, address, phoneNumber;
    List<Trip> trips = new ArrayList<>();

    public TravelAgency(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void removeTrip(Trip trip) {
        trips.remove(trip);
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
