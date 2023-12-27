package com.demo.address.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.address.AddressService;

@RestController
public class AddressController {
  
  private AddressService addressService;

  @Autowired
  public AddressController(AddressService addressService){
    this.addressService = addressService;
  }

  @GetMapping("/get-location")
  public String fetchLocation(){
    return addressService.fetchLocation();
  }
}
