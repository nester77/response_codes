package com.group20.response_codes.repository;

import com.group20.response_codes.entity.ResponseCodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseCodesRepository extends JpaRepository <ResponseCodes, Long> {
}
