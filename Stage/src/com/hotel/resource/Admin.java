package com.hotel.resource;

import com.hotel.model.Customer;
import com.hotel.model.IRoom;
import com.hotel.service.CustomerService;
import com.hotel.service.ReservationService;

import java.util.Collection;
import java.util.List;

public class Admin implements AdminResource{

    private static final Admin ADMIN = new Admin();
    private static final CustomerService CUSTOMER_SERVICE = CustomerService.getInstance();
    private static final ReservationService RESERVATION_SERVICE = ReservationService.getInstance();

    private Admin() {
    }

    public static Admin getInstance() {
        return ADMIN;
    }

    @Override
    public Customer getCustomer(String email) {
        return CUSTOMER_SERVICE.getCustomer(email);
    }

    @Override
    public Collection<IRoom> getAllRooms() {
        return RESERVATION_SERVICE.getAllRooms();
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return CUSTOMER_SERVICE.getAllCustomers();
    }

    @Override
    public void displayAllReservations() {
        RESERVATION_SERVICE.displayAllReservations();
    }
}
