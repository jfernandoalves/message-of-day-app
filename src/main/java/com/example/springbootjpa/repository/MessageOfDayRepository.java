package com.example.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootjpa.entity.MessageOfDay;

public interface MessageOfDayRepository extends JpaRepository<MessageOfDay, Long> {
}