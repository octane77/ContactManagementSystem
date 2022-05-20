package com.cms.contactmanagementsystem.service;

import com.cms.contactmanagementsystem.entity.ContactEntity;
import com.cms.contactmanagementsystem.model.Contact;
import com.cms.contactmanagementsystem.repository.ContactRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImplementation implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImplementation(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public Contact saveContact(Contact contact) {
        ContactEntity contactEntity = new ContactEntity();
        BeanUtils.copyProperties(contact, contactEntity);
        contactRepository.save(contactEntity);
        return contact;
    }

    @Override
    public List<Contact> fetchAllContacts() {
        List<ContactEntity> contactEntity = contactRepository.findAll();
        return null;
    }


}
