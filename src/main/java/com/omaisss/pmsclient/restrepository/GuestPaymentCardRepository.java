package com.omaisss.pmsclient.restrepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.omaisss.pmsclient.restentity.GuestPaymentCard;


@Repository
public interface GuestPaymentCardRepository extends CrudRepository<GuestPaymentCard, String> {

}