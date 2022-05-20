package com.cms.contactmanagementsystem.service;

import com.cms.contactmanagementsystem.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> fetchAllContacts();

}
