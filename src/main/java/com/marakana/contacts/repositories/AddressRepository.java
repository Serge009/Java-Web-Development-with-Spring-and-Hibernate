package com.marakana.contacts.repositories;

import com.marakana.contacts.Address;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Matrix on 16.07.2014.
 */
public class AddressRepository {

    private final DataSource ds;

    public AddressRepository() {
        try {
            Context context = new InitialContext();
            try{
                ds = (DataSource) context.lookup("java:comp/env/jdbc/contacts");
            } finally {
                context.close();
            }

        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    public void init(){

    }

    public Address find(long id){
        return null;
    }

    public void create(Address address){

    }

    public void delete(Address address){

    }
}
