package com.group20.response_codes.repository;

import com.group20.response_codes.entity.ResponseCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResponseCodesRepository extends JpaRepository <ResponseCodes, Long> {

//    @Query("SELECT r FROM Response_codes r") // WHERE r.status_code=:status " )
//    public List<ResponseCodes> randomResponseCodes (String status);

      @Query("SELECT r FROM Response_codes r")
      public List<ResponseCodes> getAllAirplane();
}
