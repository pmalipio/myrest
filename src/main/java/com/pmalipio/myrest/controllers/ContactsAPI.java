/*
 * Copyright (c) 2017.  Pedro Alípio, All Rights Reserved.
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 * Permission to use or copy this software for any purpose is hereby granted
 * without fee. Permission to modify the code and to distribute modified
 * code is also granted without any restrictions.
 */
package com.pmalipio.myrest.controllers;

import com.pmalipio.myrest.models.Contact;
import com.pmalipio.myrest.repositories.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/")
public class ContactsAPI {

    @Autowired
    private ContactsRepository contactsRepository;

    @RequestMapping(path = "/contacts", method = RequestMethod.GET)
    public Page<Contact> getContacts(@RequestParam(name = "page") int page,
                                     @RequestParam(name = "size") int size) {
        Page<Contact> contactsPage = contactsRepository.findAll(new PageRequest(page, size));
        return contactsPage;
    }


    @RequestMapping(path = "/contacts", method = RequestMethod.PUT)
    public void addContact(@RequestParam(name = "name") String name,
                           @RequestParam(name = "phone") String phone,
                           @RequestParam(name = "email") String email) {
        contactsRepository.save(new Contact(name, phone, email));
    }
}
