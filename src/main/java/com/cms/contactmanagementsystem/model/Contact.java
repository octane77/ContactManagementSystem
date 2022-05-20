package com.cms.contactmanagementsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contact {
    private UUID id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String mobile;
    private String office;
}
