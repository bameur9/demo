package com.example.demo.service;

import com.example.demo.model.Address;

import java.util.List;

public interface AddressService {

    public Address addAddress(Address address);
    public Address updateAddress(Address address);
    public List<Address> getAddresses();
    public Address getAddress(Long addressId);
    public void deleteAddress(Long addressId);

}
