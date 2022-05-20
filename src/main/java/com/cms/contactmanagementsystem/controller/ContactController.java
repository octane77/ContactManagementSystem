package com.cms.contactmanagementsystem.controller;

import com.cms.contactmanagementsystem.model.Contact;
import com.cms.contactmanagementsystem.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cms/api/v1")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/savecontact")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    @GetMapping
    public List<Contact> fetchAllContacts() {
        return contactService.fetchAllContacts();
    }
}