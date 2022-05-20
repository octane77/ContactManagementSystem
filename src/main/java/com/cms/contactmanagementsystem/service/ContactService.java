package com.cms.contactmanagementsystem.service;

import com.cms.contactmanagementsystem.model.Contact;

import java.util.List;
import java.util.UUID;


public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> fetchAllContacts();

    Contact fetchContactById(UUID id);

    boolean deleteContact(UUID id);

    Contact updateContact(UUID id, Contact contact);
}
