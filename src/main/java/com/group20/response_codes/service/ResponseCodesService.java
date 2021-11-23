package com.group20.response_codes.service;

import com.group20.response_codes.entity.ResponseCodes;

import java.util.List;

public interface ResponseCodesService {

    public List<ResponseCodes> getRandomResponseCodes (String status);
    public List<ResponseCodes> findAll ();
}
