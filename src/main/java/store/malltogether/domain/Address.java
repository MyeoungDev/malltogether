package store.malltogether.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String zipcode;
    private String address;
}
