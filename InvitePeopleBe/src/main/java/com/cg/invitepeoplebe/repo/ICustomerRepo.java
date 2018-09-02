package com.cg.invitepeoplebe.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.invitepeoplebe.bean.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, String> {

}
