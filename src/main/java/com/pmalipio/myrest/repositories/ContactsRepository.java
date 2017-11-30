package com.pmalipio.myrest.repositories;

import com.pmalipio.myrest.models.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends PagingAndSortingRepository<Contact, Long> {
}
