/**
 * 
 */
package com.javasampleapproach.springrest.postgresql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.springrest.postgresql.model.CustomerModel;

/**
 * @author a.pasca
 *
 */
public interface CustomerJPADao extends JpaRepository<CustomerModel, Long> {

}
