package com.group20.response_codes.repository;

import com.group20.response_codes.entity.ResponseCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResponseCodesRepository extends JpaRepository <ResponseCodes, Long> {

    @Query("SELECT r FROM ResponseCodes r WHERE r.statusCode=:status")
    public List<ResponseCodes> randomResponseCodes (String status);

    @Query("SELECT r FROM ResponseCodes r ORDER BY code")
    public List<ResponseCodes> findAll();


}
