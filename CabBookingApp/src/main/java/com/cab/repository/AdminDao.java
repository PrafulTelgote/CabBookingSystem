package com.cab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cab.models.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
